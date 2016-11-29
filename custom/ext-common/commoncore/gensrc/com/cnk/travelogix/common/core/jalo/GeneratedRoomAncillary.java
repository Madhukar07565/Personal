/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem RoomAncillary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRoomAncillary extends GenericItem
{
	/** Qualifier of the <code>RoomAncillary.ancillaryType</code> attribute **/
	public static final String ANCILLARYTYPE = "ancillaryType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ANCILLARYTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomAncillary.ancillaryType</code> attribute.
	 * @return the ancillaryType
	 */
	public EnumerationValue getAncillaryType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ANCILLARYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomAncillary.ancillaryType</code> attribute.
	 * @return the ancillaryType
	 */
	public EnumerationValue getAncillaryType()
	{
		return getAncillaryType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomAncillary.ancillaryType</code> attribute. 
	 * @param value the ancillaryType
	 */
	public void setAncillaryType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ANCILLARYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomAncillary.ancillaryType</code> attribute. 
	 * @param value the ancillaryType
	 */
	public void setAncillaryType(final EnumerationValue value)
	{
		setAncillaryType( getSession().getSessionContext(), value );
	}
	
}
