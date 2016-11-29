/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.Ship;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.CruiseUpdate CruiseUpdate}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseUpdate extends GenericItem
{
	/** Qualifier of the <code>CruiseUpdate.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>CruiseUpdate.descriptionType</code> attribute **/
	public static final String DESCRIPTIONTYPE = "descriptionType";
	/** Qualifier of the <code>CruiseUpdate.dateRange</code> attribute **/
	public static final String DATERANGE = "dateRange";
	/** Qualifier of the <code>CruiseUpdate.source</code> attribute **/
	public static final String SOURCE = "source";
	/** Qualifier of the <code>CruiseUpdate.ship</code> attribute **/
	public static final String SHIP = "ship";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SHIP's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCruiseUpdate> SHIPHANDLER = new BidirectionalOneToManyHandler<GeneratedCruiseUpdate>(
	TransportproductmasterscoreConstants.TC.CRUISEUPDATE,
	false,
	"ship",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(DESCRIPTIONTYPE, AttributeMode.INITIAL);
		tmp.put(DATERANGE, AttributeMode.INITIAL);
		tmp.put(SOURCE, AttributeMode.INITIAL);
		tmp.put(SHIP, AttributeMode.INITIAL);
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
		SHIPHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseUpdate.dateRange</code> attribute.
	 * @return the dateRange - Display From Date
	 */
	public StandardDateRange getDateRange(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, DATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseUpdate.dateRange</code> attribute.
	 * @return the dateRange - Display From Date
	 */
	public StandardDateRange getDateRange()
	{
		return getDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseUpdate.dateRange</code> attribute. 
	 * @param value the dateRange - Display From Date
	 */
	public void setDateRange(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, DATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseUpdate.dateRange</code> attribute. 
	 * @param value the dateRange - Display From Date
	 */
	public void setDateRange(final StandardDateRange value)
	{
		setDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseUpdate.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseUpdate.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseUpdate.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseUpdate.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseUpdate.descriptionType</code> attribute.
	 * @return the descriptionType - Description Type
	 */
	public String getDescriptionType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseUpdate.descriptionType</code> attribute.
	 * @return the descriptionType - Description Type
	 */
	public String getDescriptionType()
	{
		return getDescriptionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseUpdate.descriptionType</code> attribute. 
	 * @param value the descriptionType - Description Type
	 */
	public void setDescriptionType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseUpdate.descriptionType</code> attribute. 
	 * @param value the descriptionType - Description Type
	 */
	public void setDescriptionType(final String value)
	{
		setDescriptionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseUpdate.ship</code> attribute.
	 * @return the ship
	 */
	public Ship getShip(final SessionContext ctx)
	{
		return (Ship)getProperty( ctx, SHIP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseUpdate.ship</code> attribute.
	 * @return the ship
	 */
	public Ship getShip()
	{
		return getShip( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseUpdate.ship</code> attribute. 
	 * @param value the ship
	 */
	public void setShip(final SessionContext ctx, final Ship value)
	{
		SHIPHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseUpdate.ship</code> attribute. 
	 * @param value the ship
	 */
	public void setShip(final Ship value)
	{
		setShip( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseUpdate.source</code> attribute.
	 * @return the source - Source
	 */
	public String getSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseUpdate.source</code> attribute.
	 * @return the source - Source
	 */
	public String getSource()
	{
		return getSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseUpdate.source</code> attribute. 
	 * @param value the source - Source
	 */
	public void setSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseUpdate.source</code> attribute. 
	 * @param value the source - Source
	 */
	public void setSource(final String value)
	{
		setSource( getSession().getSessionContext(), value );
	}
	
}
