/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.operation.reconfirmationinterval.jalo;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.jalo.ReconfirmationConfig;
import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.operation.reconfirmationinterval.jalo.ReconfirmationInterval ReconfirmationInterval}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedReconfirmationInterval extends GenericItem
{
	/** Qualifier of the <code>ReconfirmationInterval.reconfirmationCutOff</code> attribute **/
	public static final String RECONFIRMATIONCUTOFF = "reconfirmationCutOff";
	/** Qualifier of the <code>ReconfirmationInterval.cutoff</code> attribute **/
	public static final String CUTOFF = "cutoff";
	/** Qualifier of the <code>ReconfirmationInterval.cutOffDaysOrHours</code> attribute **/
	public static final String CUTOFFDAYSORHOURS = "cutOffDaysOrHours";
	/** Qualifier of the <code>ReconfirmationInterval.reconfirmationconfig</code> attribute **/
	public static final String RECONFIRMATIONCONFIG = "reconfirmationconfig";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RECONFIRMATIONCONFIG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedReconfirmationInterval> RECONFIRMATIONCONFIGHANDLER = new BidirectionalOneToManyHandler<GeneratedReconfirmationInterval>(
	OperationmastercoreConstants.TC.RECONFIRMATIONINTERVAL,
	false,
	"reconfirmationconfig",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RECONFIRMATIONCUTOFF, AttributeMode.INITIAL);
		tmp.put(CUTOFF, AttributeMode.INITIAL);
		tmp.put(CUTOFFDAYSORHOURS, AttributeMode.INITIAL);
		tmp.put(RECONFIRMATIONCONFIG, AttributeMode.INITIAL);
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
		RECONFIRMATIONCONFIGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationInterval.cutoff</code> attribute.
	 * @return the cutoff
	 */
	public Integer getCutoff(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReconfirmationInterval.getCutoff requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, CUTOFF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationInterval.cutoff</code> attribute.
	 * @return the cutoff
	 */
	public Integer getCutoff()
	{
		return getCutoff( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationInterval.cutoff</code> attribute. 
	 * @return the cutoff
	 */
	public int getCutoffAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCutoff( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationInterval.cutoff</code> attribute. 
	 * @return the cutoff
	 */
	public int getCutoffAsPrimitive()
	{
		return getCutoffAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationInterval.cutoff</code> attribute. 
	 * @return the localized cutoff
	 */
	public Map<Language,Integer> getAllCutoff(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,CUTOFF,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationInterval.cutoff</code> attribute. 
	 * @return the localized cutoff
	 */
	public Map<Language,Integer> getAllCutoff()
	{
		return getAllCutoff( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationInterval.cutoff</code> attribute. 
	 * @param value the cutoff
	 */
	public void setCutoff(final SessionContext ctx, final Integer value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReconfirmationInterval.setCutoff requires a session language", 0 );
		}
		setLocalizedProperty(ctx, CUTOFF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationInterval.cutoff</code> attribute. 
	 * @param value the cutoff
	 */
	public void setCutoff(final Integer value)
	{
		setCutoff( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationInterval.cutoff</code> attribute. 
	 * @param value the cutoff
	 */
	public void setCutoff(final SessionContext ctx, final int value)
	{
		setCutoff( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationInterval.cutoff</code> attribute. 
	 * @param value the cutoff
	 */
	public void setCutoff(final int value)
	{
		setCutoff( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationInterval.cutoff</code> attribute. 
	 * @param value the cutoff
	 */
	public void setAllCutoff(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,CUTOFF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationInterval.cutoff</code> attribute. 
	 * @param value the cutoff
	 */
	public void setAllCutoff(final Map<Language,Integer> value)
	{
		setAllCutoff( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationInterval.cutOffDaysOrHours</code> attribute.
	 * @return the cutOffDaysOrHours
	 */
	public EnumerationValue getCutOffDaysOrHours(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CUTOFFDAYSORHOURS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationInterval.cutOffDaysOrHours</code> attribute.
	 * @return the cutOffDaysOrHours
	 */
	public EnumerationValue getCutOffDaysOrHours()
	{
		return getCutOffDaysOrHours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationInterval.cutOffDaysOrHours</code> attribute. 
	 * @param value the cutOffDaysOrHours
	 */
	public void setCutOffDaysOrHours(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CUTOFFDAYSORHOURS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationInterval.cutOffDaysOrHours</code> attribute. 
	 * @param value the cutOffDaysOrHours
	 */
	public void setCutOffDaysOrHours(final EnumerationValue value)
	{
		setCutOffDaysOrHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationInterval.reconfirmationconfig</code> attribute.
	 * @return the reconfirmationconfig
	 */
	public ReconfirmationConfig getReconfirmationconfig(final SessionContext ctx)
	{
		return (ReconfirmationConfig)getProperty( ctx, RECONFIRMATIONCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationInterval.reconfirmationconfig</code> attribute.
	 * @return the reconfirmationconfig
	 */
	public ReconfirmationConfig getReconfirmationconfig()
	{
		return getReconfirmationconfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationInterval.reconfirmationconfig</code> attribute. 
	 * @param value the reconfirmationconfig
	 */
	public void setReconfirmationconfig(final SessionContext ctx, final ReconfirmationConfig value)
	{
		RECONFIRMATIONCONFIGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationInterval.reconfirmationconfig</code> attribute. 
	 * @param value the reconfirmationconfig
	 */
	public void setReconfirmationconfig(final ReconfirmationConfig value)
	{
		setReconfirmationconfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationInterval.reconfirmationCutOff</code> attribute.
	 * @return the reconfirmationCutOff
	 */
	public EnumerationValue getReconfirmationCutOff(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RECONFIRMATIONCUTOFF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReconfirmationInterval.reconfirmationCutOff</code> attribute.
	 * @return the reconfirmationCutOff
	 */
	public EnumerationValue getReconfirmationCutOff()
	{
		return getReconfirmationCutOff( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationInterval.reconfirmationCutOff</code> attribute. 
	 * @param value the reconfirmationCutOff
	 */
	public void setReconfirmationCutOff(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RECONFIRMATIONCUTOFF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReconfirmationInterval.reconfirmationCutOff</code> attribute. 
	 * @param value the reconfirmationCutOff
	 */
	public void setReconfirmationCutOff(final EnumerationValue value)
	{
		setReconfirmationCutOff( getSession().getSessionContext(), value );
	}
	
}
