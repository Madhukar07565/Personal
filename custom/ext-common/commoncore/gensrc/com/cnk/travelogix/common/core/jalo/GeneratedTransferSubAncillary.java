/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.RoomAncillary;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem TransferSubAncillary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransferSubAncillary extends RoomAncillary
{
	/** Qualifier of the <code>TransferSubAncillary.transferType</code> attribute **/
	public static final String TRANSFERTYPE = "transferType";
	/** Qualifier of the <code>TransferSubAncillary.vehicleType</code> attribute **/
	public static final String VEHICLETYPE = "vehicleType";
	/** Qualifier of the <code>TransferSubAncillary.numberOfAdult</code> attribute **/
	public static final String NUMBEROFADULT = "numberOfAdult";
	/** Qualifier of the <code>TransferSubAncillary.numberOfChild</code> attribute **/
	public static final String NUMBEROFCHILD = "numberOfChild";
	/** Qualifier of the <code>TransferSubAncillary.issueDate</code> attribute **/
	public static final String ISSUEDATE = "issueDate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(RoomAncillary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TRANSFERTYPE, AttributeMode.INITIAL);
		tmp.put(VEHICLETYPE, AttributeMode.INITIAL);
		tmp.put(NUMBEROFADULT, AttributeMode.INITIAL);
		tmp.put(NUMBEROFCHILD, AttributeMode.INITIAL);
		tmp.put(ISSUEDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferSubAncillary.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ISSUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferSubAncillary.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate()
	{
		return getIssueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferSubAncillary.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ISSUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferSubAncillary.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final Date value)
	{
		setIssueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferSubAncillary.numberOfAdult</code> attribute.
	 * @return the numberOfAdult
	 */
	public String getNumberOfAdult(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFADULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferSubAncillary.numberOfAdult</code> attribute.
	 * @return the numberOfAdult
	 */
	public String getNumberOfAdult()
	{
		return getNumberOfAdult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferSubAncillary.numberOfAdult</code> attribute. 
	 * @param value the numberOfAdult
	 */
	public void setNumberOfAdult(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFADULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferSubAncillary.numberOfAdult</code> attribute. 
	 * @param value the numberOfAdult
	 */
	public void setNumberOfAdult(final String value)
	{
		setNumberOfAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferSubAncillary.numberOfChild</code> attribute.
	 * @return the numberOfChild
	 */
	public String getNumberOfChild(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFCHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferSubAncillary.numberOfChild</code> attribute.
	 * @return the numberOfChild
	 */
	public String getNumberOfChild()
	{
		return getNumberOfChild( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferSubAncillary.numberOfChild</code> attribute. 
	 * @param value the numberOfChild
	 */
	public void setNumberOfChild(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFCHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferSubAncillary.numberOfChild</code> attribute. 
	 * @param value the numberOfChild
	 */
	public void setNumberOfChild(final String value)
	{
		setNumberOfChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferSubAncillary.transferType</code> attribute.
	 * @return the transferType
	 */
	public EnumerationValue getTransferType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TRANSFERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferSubAncillary.transferType</code> attribute.
	 * @return the transferType
	 */
	public EnumerationValue getTransferType()
	{
		return getTransferType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferSubAncillary.transferType</code> attribute. 
	 * @param value the transferType
	 */
	public void setTransferType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TRANSFERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferSubAncillary.transferType</code> attribute. 
	 * @param value the transferType
	 */
	public void setTransferType(final EnumerationValue value)
	{
		setTransferType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferSubAncillary.vehicleType</code> attribute.
	 * @return the vehicleType
	 */
	public EnumerationValue getVehicleType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VEHICLETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransferSubAncillary.vehicleType</code> attribute.
	 * @return the vehicleType
	 */
	public EnumerationValue getVehicleType()
	{
		return getVehicleType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferSubAncillary.vehicleType</code> attribute. 
	 * @param value the vehicleType
	 */
	public void setVehicleType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VEHICLETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransferSubAncillary.vehicleType</code> attribute. 
	 * @param value the vehicleType
	 */
	public void setVehicleType(final EnumerationValue value)
	{
		setVehicleType( getSession().getSessionContext(), value );
	}
	
}
