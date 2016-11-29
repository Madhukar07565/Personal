/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.Question Question}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedQuestion extends GenericItem
{
	/** Qualifier of the <code>Question.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Question.que</code> attribute **/
	public static final String QUE = "que";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(QUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.id</code> attribute.
	 * @return the id - Represents question id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.id</code> attribute.
	 * @return the id - Represents question id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.id</code> attribute. 
	 * @param value the id - Represents question id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.id</code> attribute. 
	 * @param value the id - Represents question id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.que</code> attribute.
	 * @return the que - Represents question definition
	 */
	public String getQue(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedQuestion.getQue requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, QUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.que</code> attribute.
	 * @return the que - Represents question definition
	 */
	public String getQue()
	{
		return getQue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.que</code> attribute. 
	 * @return the localized que - Represents question definition
	 */
	public Map<Language,String> getAllQue(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,QUE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.que</code> attribute. 
	 * @return the localized que - Represents question definition
	 */
	public Map<Language,String> getAllQue()
	{
		return getAllQue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.que</code> attribute. 
	 * @param value the que - Represents question definition
	 */
	public void setQue(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedQuestion.setQue requires a session language", 0 );
		}
		setLocalizedProperty(ctx, QUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.que</code> attribute. 
	 * @param value the que - Represents question definition
	 */
	public void setQue(final String value)
	{
		setQue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.que</code> attribute. 
	 * @param value the que - Represents question definition
	 */
	public void setAllQue(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,QUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.que</code> attribute. 
	 * @param value the que - Represents question definition
	 */
	public void setAllQue(final Map<Language,String> value)
	{
		setAllQue( getSession().getSessionContext(), value );
	}
	
}
