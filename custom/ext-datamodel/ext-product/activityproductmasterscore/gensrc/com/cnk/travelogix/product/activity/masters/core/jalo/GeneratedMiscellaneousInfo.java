/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.GeneralDescription;
import com.cnk.travelogix.product.activity.masters.core.jalo.MiscellaneousRestriction;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.MiscellaneousInfo MiscellaneousInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMiscellaneousInfo extends GenericItem
{
	/** Qualifier of the <code>MiscellaneousInfo.miscellanousRestrictions</code> attribute **/
	public static final String MISCELLANOUSRESTRICTIONS = "miscellanousRestrictions";
	/** Qualifier of the <code>MiscellaneousInfo.generalInfo</code> attribute **/
	public static final String GENERALINFO = "generalInfo";
	/**
	* {@link OneToManyHandler} for handling 1:n MISCELLANOUSRESTRICTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MiscellaneousRestriction> MISCELLANOUSRESTRICTIONSHANDLER = new OneToManyHandler<MiscellaneousRestriction>(
	ActivityproductmasterscoreConstants.TC.MISCELLANEOUSRESTRICTION,
	false,
	"miscellaneousInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n GENERALINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<GeneralDescription> GENERALINFOHANDLER = new OneToManyHandler<GeneralDescription>(
	ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO,
	false,
	"miscellaneousInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousInfo.generalInfo</code> attribute.
	 * @return the generalInfo
	 */
	public Collection<GeneralDescription> getGeneralInfo(final SessionContext ctx)
	{
		return GENERALINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousInfo.generalInfo</code> attribute.
	 * @return the generalInfo
	 */
	public Collection<GeneralDescription> getGeneralInfo()
	{
		return getGeneralInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousInfo.generalInfo</code> attribute. 
	 * @param value the generalInfo
	 */
	public void setGeneralInfo(final SessionContext ctx, final Collection<GeneralDescription> value)
	{
		GENERALINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousInfo.generalInfo</code> attribute. 
	 * @param value the generalInfo
	 */
	public void setGeneralInfo(final Collection<GeneralDescription> value)
	{
		setGeneralInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to generalInfo. 
	 * @param value the item to add to generalInfo
	 */
	public void addToGeneralInfo(final SessionContext ctx, final GeneralDescription value)
	{
		GENERALINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to generalInfo. 
	 * @param value the item to add to generalInfo
	 */
	public void addToGeneralInfo(final GeneralDescription value)
	{
		addToGeneralInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from generalInfo. 
	 * @param value the item to remove from generalInfo
	 */
	public void removeFromGeneralInfo(final SessionContext ctx, final GeneralDescription value)
	{
		GENERALINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from generalInfo. 
	 * @param value the item to remove from generalInfo
	 */
	public void removeFromGeneralInfo(final GeneralDescription value)
	{
		removeFromGeneralInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousInfo.miscellanousRestrictions</code> attribute.
	 * @return the miscellanousRestrictions
	 */
	public Collection<MiscellaneousRestriction> getMiscellanousRestrictions(final SessionContext ctx)
	{
		return MISCELLANOUSRESTRICTIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousInfo.miscellanousRestrictions</code> attribute.
	 * @return the miscellanousRestrictions
	 */
	public Collection<MiscellaneousRestriction> getMiscellanousRestrictions()
	{
		return getMiscellanousRestrictions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousInfo.miscellanousRestrictions</code> attribute. 
	 * @param value the miscellanousRestrictions
	 */
	public void setMiscellanousRestrictions(final SessionContext ctx, final Collection<MiscellaneousRestriction> value)
	{
		MISCELLANOUSRESTRICTIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousInfo.miscellanousRestrictions</code> attribute. 
	 * @param value the miscellanousRestrictions
	 */
	public void setMiscellanousRestrictions(final Collection<MiscellaneousRestriction> value)
	{
		setMiscellanousRestrictions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to miscellanousRestrictions. 
	 * @param value the item to add to miscellanousRestrictions
	 */
	public void addToMiscellanousRestrictions(final SessionContext ctx, final MiscellaneousRestriction value)
	{
		MISCELLANOUSRESTRICTIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to miscellanousRestrictions. 
	 * @param value the item to add to miscellanousRestrictions
	 */
	public void addToMiscellanousRestrictions(final MiscellaneousRestriction value)
	{
		addToMiscellanousRestrictions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from miscellanousRestrictions. 
	 * @param value the item to remove from miscellanousRestrictions
	 */
	public void removeFromMiscellanousRestrictions(final SessionContext ctx, final MiscellaneousRestriction value)
	{
		MISCELLANOUSRESTRICTIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from miscellanousRestrictions. 
	 * @param value the item to remove from miscellanousRestrictions
	 */
	public void removeFromMiscellanousRestrictions(final MiscellaneousRestriction value)
	{
		removeFromMiscellanousRestrictions( getSession().getSessionContext(), value );
	}
	
}
