/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.Lead;
import com.cnk.travelogix.presales.jalo.Question;
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
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.QuestionInformation QuestionInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedQuestionInformation extends GenericItem
{
	/** Qualifier of the <code>QuestionInformation.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>QuestionInformation.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>QuestionInformation.question</code> attribute **/
	public static final String QUESTION = "question";
	/** Qualifier of the <code>QuestionInformation.lead</code> attribute **/
	public static final String LEAD = "lead";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n LEAD's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedQuestionInformation> LEADHANDLER = new BidirectionalOneToManyHandler<GeneratedQuestionInformation>(
	PresalescoreConstants.TC.QUESTIONINFORMATION,
	false,
	"lead",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(QUESTION, AttributeMode.INITIAL);
		tmp.put(LEAD, AttributeMode.INITIAL);
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
		LEADHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuestionInformation.description</code> attribute.
	 * @return the description - description for Question
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedQuestionInformation.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuestionInformation.description</code> attribute.
	 * @return the description - description for Question
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuestionInformation.description</code> attribute. 
	 * @return the localized description - description for Question
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuestionInformation.description</code> attribute. 
	 * @return the localized description - description for Question
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>QuestionInformation.description</code> attribute. 
	 * @param value the description - description for Question
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedQuestionInformation.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>QuestionInformation.description</code> attribute. 
	 * @param value the description - description for Question
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>QuestionInformation.description</code> attribute. 
	 * @param value the description - description for Question
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>QuestionInformation.description</code> attribute. 
	 * @param value the description - description for Question
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuestionInformation.lead</code> attribute.
	 * @return the lead
	 */
	public Lead getLead(final SessionContext ctx)
	{
		return (Lead)getProperty( ctx, LEAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuestionInformation.lead</code> attribute.
	 * @return the lead
	 */
	public Lead getLead()
	{
		return getLead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>QuestionInformation.lead</code> attribute. 
	 * @param value the lead
	 */
	public void setLead(final SessionContext ctx, final Lead value)
	{
		LEADHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>QuestionInformation.lead</code> attribute. 
	 * @param value the lead
	 */
	public void setLead(final Lead value)
	{
		setLead( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuestionInformation.question</code> attribute.
	 * @return the question - Defines Question
	 */
	public Question getQuestion(final SessionContext ctx)
	{
		return (Question)getProperty( ctx, QUESTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuestionInformation.question</code> attribute.
	 * @return the question - Defines Question
	 */
	public Question getQuestion()
	{
		return getQuestion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>QuestionInformation.question</code> attribute. 
	 * @param value the question - Defines Question
	 */
	public void setQuestion(final SessionContext ctx, final Question value)
	{
		setProperty(ctx, QUESTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>QuestionInformation.question</code> attribute. 
	 * @param value the question - Defines Question
	 */
	public void setQuestion(final Question value)
	{
		setQuestion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuestionInformation.title</code> attribute.
	 * @return the title - Defines title of Question
	 */
	public EnumerationValue getTitle(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuestionInformation.title</code> attribute.
	 * @return the title - Defines title of Question
	 */
	public EnumerationValue getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>QuestionInformation.title</code> attribute. 
	 * @param value the title - Defines title of Question
	 */
	public void setTitle(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>QuestionInformation.title</code> attribute. 
	 * @param value the title - Defines title of Question
	 */
	public void setTitle(final EnumerationValue value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
