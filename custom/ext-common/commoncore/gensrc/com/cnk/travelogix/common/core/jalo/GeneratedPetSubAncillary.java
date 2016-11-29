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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem PetSubAncillary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPetSubAncillary extends RoomAncillary
{
	/** Qualifier of the <code>PetSubAncillary.numberOfPets</code> attribute **/
	public static final String NUMBEROFPETS = "numberOfPets";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(RoomAncillary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NUMBEROFPETS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PetSubAncillary.numberOfPets</code> attribute.
	 * @return the numberOfPets
	 */
	public String getNumberOfPets(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFPETS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PetSubAncillary.numberOfPets</code> attribute.
	 * @return the numberOfPets
	 */
	public String getNumberOfPets()
	{
		return getNumberOfPets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PetSubAncillary.numberOfPets</code> attribute. 
	 * @param value the numberOfPets
	 */
	public void setNumberOfPets(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFPETS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PetSubAncillary.numberOfPets</code> attribute. 
	 * @param value the numberOfPets
	 */
	public void setNumberOfPets(final String value)
	{
		setNumberOfPets( getSession().getSessionContext(), value );
	}
	
}
