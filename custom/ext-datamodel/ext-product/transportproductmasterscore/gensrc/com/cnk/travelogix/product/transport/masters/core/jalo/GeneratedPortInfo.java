/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruisePort;
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
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.PortInfo PortInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPortInfo extends GenericItem
{
	/** Qualifier of the <code>PortInfo.informationType</code> attribute **/
	public static final String INFORMATIONTYPE = "informationType";
	/** Qualifier of the <code>PortInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>PortInfo.cruisePort</code> attribute **/
	public static final String CRUISEPORT = "cruisePort";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISEPORT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPortInfo> CRUISEPORTHANDLER = new BidirectionalOneToManyHandler<GeneratedPortInfo>(
	TransportproductmasterscoreConstants.TC.PORTINFO,
	false,
	"cruisePort",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INFORMATIONTYPE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(CRUISEPORT, AttributeMode.INITIAL);
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
		CRUISEPORTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PortInfo.cruisePort</code> attribute.
	 * @return the cruisePort
	 */
	public CruisePort getCruisePort(final SessionContext ctx)
	{
		return (CruisePort)getProperty( ctx, CRUISEPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PortInfo.cruisePort</code> attribute.
	 * @return the cruisePort
	 */
	public CruisePort getCruisePort()
	{
		return getCruisePort( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PortInfo.cruisePort</code> attribute. 
	 * @param value the cruisePort
	 */
	public void setCruisePort(final SessionContext ctx, final CruisePort value)
	{
		CRUISEPORTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PortInfo.cruisePort</code> attribute. 
	 * @param value the cruisePort
	 */
	public void setCruisePort(final CruisePort value)
	{
		setCruisePort( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PortInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PortInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PortInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PortInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PortInfo.informationType</code> attribute.
	 * @return the informationType - Information Type
	 */
	public EnumerationValue getInformationType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, INFORMATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PortInfo.informationType</code> attribute.
	 * @return the informationType - Information Type
	 */
	public EnumerationValue getInformationType()
	{
		return getInformationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PortInfo.informationType</code> attribute. 
	 * @param value the informationType - Information Type
	 */
	public void setInformationType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, INFORMATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PortInfo.informationType</code> attribute. 
	 * @param value the informationType - Information Type
	 */
	public void setInformationType(final EnumerationValue value)
	{
		setInformationType( getSession().getSessionContext(), value );
	}
	
}
