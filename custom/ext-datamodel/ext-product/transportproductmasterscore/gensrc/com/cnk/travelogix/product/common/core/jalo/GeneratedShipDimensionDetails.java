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
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.ShipDimensionDetails ShipDimensionDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShipDimensionDetails extends GenericItem
{
	/** Qualifier of the <code>ShipDimensionDetails.lengthOverall</code> attribute **/
	public static final String LENGTHOVERALL = "lengthOverall";
	/** Qualifier of the <code>ShipDimensionDetails.lengthAtWaterLine</code> attribute **/
	public static final String LENGTHATWATERLINE = "lengthAtWaterLine";
	/** Qualifier of the <code>ShipDimensionDetails.beam</code> attribute **/
	public static final String BEAM = "beam";
	/** Qualifier of the <code>ShipDimensionDetails.grossTonnage</code> attribute **/
	public static final String GROSSTONNAGE = "grossTonnage";
	/** Qualifier of the <code>ShipDimensionDetails.draftMin</code> attribute **/
	public static final String DRAFTMIN = "draftMin";
	/** Qualifier of the <code>ShipDimensionDetails.draftMax</code> attribute **/
	public static final String DRAFTMAX = "draftMax";
	/** Qualifier of the <code>ShipDimensionDetails.heightAtWaterLine</code> attribute **/
	public static final String HEIGHTATWATERLINE = "heightAtWaterLine";
	/** Qualifier of the <code>ShipDimensionDetails.overallHeight</code> attribute **/
	public static final String OVERALLHEIGHT = "overallHeight";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(LENGTHOVERALL, AttributeMode.INITIAL);
		tmp.put(LENGTHATWATERLINE, AttributeMode.INITIAL);
		tmp.put(BEAM, AttributeMode.INITIAL);
		tmp.put(GROSSTONNAGE, AttributeMode.INITIAL);
		tmp.put(DRAFTMIN, AttributeMode.INITIAL);
		tmp.put(DRAFTMAX, AttributeMode.INITIAL);
		tmp.put(HEIGHTATWATERLINE, AttributeMode.INITIAL);
		tmp.put(OVERALLHEIGHT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.beam</code> attribute.
	 * @return the beam - Beam
	 */
	public String getBeam(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BEAM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.beam</code> attribute.
	 * @return the beam - Beam
	 */
	public String getBeam()
	{
		return getBeam( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.beam</code> attribute. 
	 * @param value the beam - Beam
	 */
	public void setBeam(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BEAM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.beam</code> attribute. 
	 * @param value the beam - Beam
	 */
	public void setBeam(final String value)
	{
		setBeam( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.draftMax</code> attribute.
	 * @return the draftMax - Draft Max
	 */
	public String getDraftMax(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DRAFTMAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.draftMax</code> attribute.
	 * @return the draftMax - Draft Max
	 */
	public String getDraftMax()
	{
		return getDraftMax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.draftMax</code> attribute. 
	 * @param value the draftMax - Draft Max
	 */
	public void setDraftMax(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DRAFTMAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.draftMax</code> attribute. 
	 * @param value the draftMax - Draft Max
	 */
	public void setDraftMax(final String value)
	{
		setDraftMax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.draftMin</code> attribute.
	 * @return the draftMin - Draft Min
	 */
	public String getDraftMin(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DRAFTMIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.draftMin</code> attribute.
	 * @return the draftMin - Draft Min
	 */
	public String getDraftMin()
	{
		return getDraftMin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.draftMin</code> attribute. 
	 * @param value the draftMin - Draft Min
	 */
	public void setDraftMin(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DRAFTMIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.draftMin</code> attribute. 
	 * @param value the draftMin - Draft Min
	 */
	public void setDraftMin(final String value)
	{
		setDraftMin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.grossTonnage</code> attribute.
	 * @return the grossTonnage - Gross Tonnage
	 */
	public String getGrossTonnage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GROSSTONNAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.grossTonnage</code> attribute.
	 * @return the grossTonnage - Gross Tonnage
	 */
	public String getGrossTonnage()
	{
		return getGrossTonnage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.grossTonnage</code> attribute. 
	 * @param value the grossTonnage - Gross Tonnage
	 */
	public void setGrossTonnage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GROSSTONNAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.grossTonnage</code> attribute. 
	 * @param value the grossTonnage - Gross Tonnage
	 */
	public void setGrossTonnage(final String value)
	{
		setGrossTonnage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.heightAtWaterLine</code> attribute.
	 * @return the heightAtWaterLine - Height At Water Line
	 */
	public String getHeightAtWaterLine(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEIGHTATWATERLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.heightAtWaterLine</code> attribute.
	 * @return the heightAtWaterLine - Height At Water Line
	 */
	public String getHeightAtWaterLine()
	{
		return getHeightAtWaterLine( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.heightAtWaterLine</code> attribute. 
	 * @param value the heightAtWaterLine - Height At Water Line
	 */
	public void setHeightAtWaterLine(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEIGHTATWATERLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.heightAtWaterLine</code> attribute. 
	 * @param value the heightAtWaterLine - Height At Water Line
	 */
	public void setHeightAtWaterLine(final String value)
	{
		setHeightAtWaterLine( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.lengthAtWaterLine</code> attribute.
	 * @return the lengthAtWaterLine - Length At WaterLine
	 */
	public String getLengthAtWaterLine(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LENGTHATWATERLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.lengthAtWaterLine</code> attribute.
	 * @return the lengthAtWaterLine - Length At WaterLine
	 */
	public String getLengthAtWaterLine()
	{
		return getLengthAtWaterLine( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.lengthAtWaterLine</code> attribute. 
	 * @param value the lengthAtWaterLine - Length At WaterLine
	 */
	public void setLengthAtWaterLine(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LENGTHATWATERLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.lengthAtWaterLine</code> attribute. 
	 * @param value the lengthAtWaterLine - Length At WaterLine
	 */
	public void setLengthAtWaterLine(final String value)
	{
		setLengthAtWaterLine( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.lengthOverall</code> attribute.
	 * @return the lengthOverall - Length Over all
	 */
	public String getLengthOverall(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LENGTHOVERALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.lengthOverall</code> attribute.
	 * @return the lengthOverall - Length Over all
	 */
	public String getLengthOverall()
	{
		return getLengthOverall( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.lengthOverall</code> attribute. 
	 * @param value the lengthOverall - Length Over all
	 */
	public void setLengthOverall(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LENGTHOVERALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.lengthOverall</code> attribute. 
	 * @param value the lengthOverall - Length Over all
	 */
	public void setLengthOverall(final String value)
	{
		setLengthOverall( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.overallHeight</code> attribute.
	 * @return the overallHeight - Over all Height
	 */
	public String getOverallHeight(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OVERALLHEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDimensionDetails.overallHeight</code> attribute.
	 * @return the overallHeight - Over all Height
	 */
	public String getOverallHeight()
	{
		return getOverallHeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.overallHeight</code> attribute. 
	 * @param value the overallHeight - Over all Height
	 */
	public void setOverallHeight(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OVERALLHEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDimensionDetails.overallHeight</code> attribute. 
	 * @param value the overallHeight - Over all Height
	 */
	public void setOverallHeight(final String value)
	{
		setOverallHeight( getSession().getSessionContext(), value );
	}
	
}
