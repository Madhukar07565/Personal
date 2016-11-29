/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.RescueSecurityDetails RescueSecurityDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRescueSecurityDetails extends GenericItem
{
	/** Qualifier of the <code>RescueSecurityDetails.cdcScore</code> attribute **/
	public static final String CDCSCORE = "cdcScore";
	/** Qualifier of the <code>RescueSecurityDetails.cdcDate</code> attribute **/
	public static final String CDCDATE = "cdcDate";
	/** Qualifier of the <code>RescueSecurityDetails.noOfLifeboats</code> attribute **/
	public static final String NOOFLIFEBOATS = "noOfLifeboats";
	/** Qualifier of the <code>RescueSecurityDetails.noOfTenders</code> attribute **/
	public static final String NOOFTENDERS = "noOfTenders";
	/** Qualifier of the <code>RescueSecurityDetails.noOfRescueBoats</code> attribute **/
	public static final String NOOFRESCUEBOATS = "noOfRescueBoats";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CDCSCORE, AttributeMode.INITIAL);
		tmp.put(CDCDATE, AttributeMode.INITIAL);
		tmp.put(NOOFLIFEBOATS, AttributeMode.INITIAL);
		tmp.put(NOOFTENDERS, AttributeMode.INITIAL);
		tmp.put(NOOFRESCUEBOATS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RescueSecurityDetails.cdcDate</code> attribute.
	 * @return the cdcDate - Cdc Date
	 */
	public Date getCdcDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CDCDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RescueSecurityDetails.cdcDate</code> attribute.
	 * @return the cdcDate - Cdc Date
	 */
	public Date getCdcDate()
	{
		return getCdcDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RescueSecurityDetails.cdcDate</code> attribute. 
	 * @param value the cdcDate - Cdc Date
	 */
	public void setCdcDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CDCDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RescueSecurityDetails.cdcDate</code> attribute. 
	 * @param value the cdcDate - Cdc Date
	 */
	public void setCdcDate(final Date value)
	{
		setCdcDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RescueSecurityDetails.cdcScore</code> attribute.
	 * @return the cdcScore - Cdc Score
	 */
	public Integer getCdcScore(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CDCSCORE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RescueSecurityDetails.cdcScore</code> attribute.
	 * @return the cdcScore - Cdc Score
	 */
	public Integer getCdcScore()
	{
		return getCdcScore( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RescueSecurityDetails.cdcScore</code> attribute. 
	 * @return the cdcScore - Cdc Score
	 */
	public int getCdcScoreAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCdcScore( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RescueSecurityDetails.cdcScore</code> attribute. 
	 * @return the cdcScore - Cdc Score
	 */
	public int getCdcScoreAsPrimitive()
	{
		return getCdcScoreAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RescueSecurityDetails.cdcScore</code> attribute. 
	 * @param value the cdcScore - Cdc Score
	 */
	public void setCdcScore(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CDCSCORE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RescueSecurityDetails.cdcScore</code> attribute. 
	 * @param value the cdcScore - Cdc Score
	 */
	public void setCdcScore(final Integer value)
	{
		setCdcScore( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RescueSecurityDetails.cdcScore</code> attribute. 
	 * @param value the cdcScore - Cdc Score
	 */
	public void setCdcScore(final SessionContext ctx, final int value)
	{
		setCdcScore( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RescueSecurityDetails.cdcScore</code> attribute. 
	 * @param value the cdcScore - Cdc Score
	 */
	public void setCdcScore(final int value)
	{
		setCdcScore( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RescueSecurityDetails.noOfLifeboats</code> attribute.
	 * @return the noOfLifeboats - No Of Life boats
	 */
	public String getNoOfLifeboats(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOOFLIFEBOATS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RescueSecurityDetails.noOfLifeboats</code> attribute.
	 * @return the noOfLifeboats - No Of Life boats
	 */
	public String getNoOfLifeboats()
	{
		return getNoOfLifeboats( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RescueSecurityDetails.noOfLifeboats</code> attribute. 
	 * @param value the noOfLifeboats - No Of Life boats
	 */
	public void setNoOfLifeboats(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOOFLIFEBOATS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RescueSecurityDetails.noOfLifeboats</code> attribute. 
	 * @param value the noOfLifeboats - No Of Life boats
	 */
	public void setNoOfLifeboats(final String value)
	{
		setNoOfLifeboats( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RescueSecurityDetails.noOfRescueBoats</code> attribute.
	 * @return the noOfRescueBoats - No Of Rescue Boats
	 */
	public String getNoOfRescueBoats(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOOFRESCUEBOATS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RescueSecurityDetails.noOfRescueBoats</code> attribute.
	 * @return the noOfRescueBoats - No Of Rescue Boats
	 */
	public String getNoOfRescueBoats()
	{
		return getNoOfRescueBoats( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RescueSecurityDetails.noOfRescueBoats</code> attribute. 
	 * @param value the noOfRescueBoats - No Of Rescue Boats
	 */
	public void setNoOfRescueBoats(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOOFRESCUEBOATS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RescueSecurityDetails.noOfRescueBoats</code> attribute. 
	 * @param value the noOfRescueBoats - No Of Rescue Boats
	 */
	public void setNoOfRescueBoats(final String value)
	{
		setNoOfRescueBoats( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RescueSecurityDetails.noOfTenders</code> attribute.
	 * @return the noOfTenders - No Of Tenders
	 */
	public String getNoOfTenders(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOOFTENDERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RescueSecurityDetails.noOfTenders</code> attribute.
	 * @return the noOfTenders - No Of Tenders
	 */
	public String getNoOfTenders()
	{
		return getNoOfTenders( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RescueSecurityDetails.noOfTenders</code> attribute. 
	 * @param value the noOfTenders - No Of Tenders
	 */
	public void setNoOfTenders(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOOFTENDERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RescueSecurityDetails.noOfTenders</code> attribute. 
	 * @param value the noOfTenders - No Of Tenders
	 */
	public void setNoOfTenders(final String value)
	{
		setNoOfTenders( getSession().getSessionContext(), value );
	}
	
}
