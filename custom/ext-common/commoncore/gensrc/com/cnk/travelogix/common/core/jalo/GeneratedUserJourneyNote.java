/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.UserJourneyInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem UserJourneyNote}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedUserJourneyNote extends GenericItem
{
	/** Qualifier of the <code>UserJourneyNote.submitter</code> attribute **/
	public static final String SUBMITTER = "submitter";
	/** Qualifier of the <code>UserJourneyNote.text</code> attribute **/
	public static final String TEXT = "text";
	/** Qualifier of the <code>UserJourneyNote.journeyInfo</code> attribute **/
	public static final String JOURNEYINFO = "journeyInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n JOURNEYINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedUserJourneyNote> JOURNEYINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedUserJourneyNote>(
	CommonCoreConstants.TC.USERJOURNEYNOTE,
	false,
	"journeyInfo",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SUBMITTER, AttributeMode.INITIAL);
		tmp.put(TEXT, AttributeMode.INITIAL);
		tmp.put(JOURNEYINFO, AttributeMode.INITIAL);
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
		JOURNEYINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyNote.journeyInfo</code> attribute.
	 * @return the journeyInfo
	 */
	public UserJourneyInfo getJourneyInfo(final SessionContext ctx)
	{
		return (UserJourneyInfo)getProperty( ctx, JOURNEYINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyNote.journeyInfo</code> attribute.
	 * @return the journeyInfo
	 */
	public UserJourneyInfo getJourneyInfo()
	{
		return getJourneyInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyNote.journeyInfo</code> attribute. 
	 * @param value the journeyInfo
	 */
	public void setJourneyInfo(final SessionContext ctx, final UserJourneyInfo value)
	{
		JOURNEYINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyNote.journeyInfo</code> attribute. 
	 * @param value the journeyInfo
	 */
	public void setJourneyInfo(final UserJourneyInfo value)
	{
		setJourneyInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyNote.submitter</code> attribute.
	 * @return the submitter
	 */
	public User getSubmitter(final SessionContext ctx)
	{
		return (User)getProperty( ctx, SUBMITTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyNote.submitter</code> attribute.
	 * @return the submitter
	 */
	public User getSubmitter()
	{
		return getSubmitter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyNote.submitter</code> attribute. 
	 * @param value the submitter
	 */
	public void setSubmitter(final SessionContext ctx, final User value)
	{
		setProperty(ctx, SUBMITTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyNote.submitter</code> attribute. 
	 * @param value the submitter
	 */
	public void setSubmitter(final User value)
	{
		setSubmitter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyNote.text</code> attribute.
	 * @return the text
	 */
	public String getText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyNote.text</code> attribute.
	 * @return the text
	 */
	public String getText()
	{
		return getText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyNote.text</code> attribute. 
	 * @param value the text
	 */
	public void setText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyNote.text</code> attribute. 
	 * @param value the text
	 */
	public void setText(final String value)
	{
		setText( getSession().getSessionContext(), value );
	}
	
}
