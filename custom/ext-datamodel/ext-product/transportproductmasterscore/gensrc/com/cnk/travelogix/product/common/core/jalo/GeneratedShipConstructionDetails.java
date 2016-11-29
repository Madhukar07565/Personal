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
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.ShipConstructionDetails ShipConstructionDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShipConstructionDetails extends GenericItem
{
	/** Qualifier of the <code>ShipConstructionDetails.hullMaterial</code> attribute **/
	public static final String HULLMATERIAL = "hullMaterial";
	/** Qualifier of the <code>ShipConstructionDetails.superStructure</code> attribute **/
	public static final String SUPERSTRUCTURE = "superStructure";
	/** Qualifier of the <code>ShipConstructionDetails.deckMaterial</code> attribute **/
	public static final String DECKMATERIAL = "deckMaterial";
	/** Qualifier of the <code>ShipConstructionDetails.deckNB</code> attribute **/
	public static final String DECKNB = "deckNB";
	/** Qualifier of the <code>ShipConstructionDetails.hullConfiguration</code> attribute **/
	public static final String HULLCONFIGURATION = "hullConfiguration";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(HULLMATERIAL, AttributeMode.INITIAL);
		tmp.put(SUPERSTRUCTURE, AttributeMode.INITIAL);
		tmp.put(DECKMATERIAL, AttributeMode.INITIAL);
		tmp.put(DECKNB, AttributeMode.INITIAL);
		tmp.put(HULLCONFIGURATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipConstructionDetails.deckMaterial</code> attribute.
	 * @return the deckMaterial - Deck Material
	 */
	public String getDeckMaterial(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DECKMATERIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipConstructionDetails.deckMaterial</code> attribute.
	 * @return the deckMaterial - Deck Material
	 */
	public String getDeckMaterial()
	{
		return getDeckMaterial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipConstructionDetails.deckMaterial</code> attribute. 
	 * @param value the deckMaterial - Deck Material
	 */
	public void setDeckMaterial(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DECKMATERIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipConstructionDetails.deckMaterial</code> attribute. 
	 * @param value the deckMaterial - Deck Material
	 */
	public void setDeckMaterial(final String value)
	{
		setDeckMaterial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipConstructionDetails.deckNB</code> attribute.
	 * @return the deckNB - Deck NB
	 */
	public String getDeckNB(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DECKNB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipConstructionDetails.deckNB</code> attribute.
	 * @return the deckNB - Deck NB
	 */
	public String getDeckNB()
	{
		return getDeckNB( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipConstructionDetails.deckNB</code> attribute. 
	 * @param value the deckNB - Deck NB
	 */
	public void setDeckNB(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DECKNB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipConstructionDetails.deckNB</code> attribute. 
	 * @param value the deckNB - Deck NB
	 */
	public void setDeckNB(final String value)
	{
		setDeckNB( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipConstructionDetails.hullConfiguration</code> attribute.
	 * @return the hullConfiguration - Hull Configuration
	 */
	public String getHullConfiguration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HULLCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipConstructionDetails.hullConfiguration</code> attribute.
	 * @return the hullConfiguration - Hull Configuration
	 */
	public String getHullConfiguration()
	{
		return getHullConfiguration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipConstructionDetails.hullConfiguration</code> attribute. 
	 * @param value the hullConfiguration - Hull Configuration
	 */
	public void setHullConfiguration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HULLCONFIGURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipConstructionDetails.hullConfiguration</code> attribute. 
	 * @param value the hullConfiguration - Hull Configuration
	 */
	public void setHullConfiguration(final String value)
	{
		setHullConfiguration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipConstructionDetails.hullMaterial</code> attribute.
	 * @return the hullMaterial - Hull Material
	 */
	public String getHullMaterial(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HULLMATERIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipConstructionDetails.hullMaterial</code> attribute.
	 * @return the hullMaterial - Hull Material
	 */
	public String getHullMaterial()
	{
		return getHullMaterial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipConstructionDetails.hullMaterial</code> attribute. 
	 * @param value the hullMaterial - Hull Material
	 */
	public void setHullMaterial(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HULLMATERIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipConstructionDetails.hullMaterial</code> attribute. 
	 * @param value the hullMaterial - Hull Material
	 */
	public void setHullMaterial(final String value)
	{
		setHullMaterial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipConstructionDetails.superStructure</code> attribute.
	 * @return the superStructure - Super Structure
	 */
	public String getSuperStructure(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPERSTRUCTURE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipConstructionDetails.superStructure</code> attribute.
	 * @return the superStructure - Super Structure
	 */
	public String getSuperStructure()
	{
		return getSuperStructure( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipConstructionDetails.superStructure</code> attribute. 
	 * @param value the superStructure - Super Structure
	 */
	public void setSuperStructure(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPERSTRUCTURE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipConstructionDetails.superStructure</code> attribute. 
	 * @param value the superStructure - Super Structure
	 */
	public void setSuperStructure(final String value)
	{
		setSuperStructure( getSession().getSessionContext(), value );
	}
	
}
