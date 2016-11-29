/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.general.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.general.jalo.LanguageSkillInfo LanguageSkillInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLanguageSkillInfo extends GenericItem
{
	/** Qualifier of the <code>LanguageSkillInfo.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>LanguageSkillInfo.read</code> attribute **/
	public static final String READ = "read";
	/** Qualifier of the <code>LanguageSkillInfo.write</code> attribute **/
	public static final String WRITE = "write";
	/** Qualifier of the <code>LanguageSkillInfo.speak</code> attribute **/
	public static final String SPEAK = "speak";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		tmp.put(READ, AttributeMode.INITIAL);
		tmp.put(WRITE, AttributeMode.INITIAL);
		tmp.put(SPEAK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage(final SessionContext ctx)
	{
		return (Language)getProperty( ctx, LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final SessionContext ctx, final Language value)
	{
		setProperty(ctx, LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final Language value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.read</code> attribute.
	 * @return the read
	 */
	public Boolean isRead(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, READ);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.read</code> attribute.
	 * @return the read
	 */
	public Boolean isRead()
	{
		return isRead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.read</code> attribute. 
	 * @return the read
	 */
	public boolean isReadAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRead( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.read</code> attribute. 
	 * @return the read
	 */
	public boolean isReadAsPrimitive()
	{
		return isReadAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.read</code> attribute. 
	 * @param value the read
	 */
	public void setRead(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, READ,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.read</code> attribute. 
	 * @param value the read
	 */
	public void setRead(final Boolean value)
	{
		setRead( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.read</code> attribute. 
	 * @param value the read
	 */
	public void setRead(final SessionContext ctx, final boolean value)
	{
		setRead( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.read</code> attribute. 
	 * @param value the read
	 */
	public void setRead(final boolean value)
	{
		setRead( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.speak</code> attribute.
	 * @return the speak
	 */
	public Boolean isSpeak(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SPEAK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.speak</code> attribute.
	 * @return the speak
	 */
	public Boolean isSpeak()
	{
		return isSpeak( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.speak</code> attribute. 
	 * @return the speak
	 */
	public boolean isSpeakAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSpeak( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.speak</code> attribute. 
	 * @return the speak
	 */
	public boolean isSpeakAsPrimitive()
	{
		return isSpeakAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.speak</code> attribute. 
	 * @param value the speak
	 */
	public void setSpeak(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SPEAK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.speak</code> attribute. 
	 * @param value the speak
	 */
	public void setSpeak(final Boolean value)
	{
		setSpeak( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.speak</code> attribute. 
	 * @param value the speak
	 */
	public void setSpeak(final SessionContext ctx, final boolean value)
	{
		setSpeak( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.speak</code> attribute. 
	 * @param value the speak
	 */
	public void setSpeak(final boolean value)
	{
		setSpeak( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.write</code> attribute.
	 * @return the write
	 */
	public Boolean isWrite(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, WRITE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.write</code> attribute.
	 * @return the write
	 */
	public Boolean isWrite()
	{
		return isWrite( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.write</code> attribute. 
	 * @return the write
	 */
	public boolean isWriteAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isWrite( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LanguageSkillInfo.write</code> attribute. 
	 * @return the write
	 */
	public boolean isWriteAsPrimitive()
	{
		return isWriteAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.write</code> attribute. 
	 * @param value the write
	 */
	public void setWrite(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, WRITE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.write</code> attribute. 
	 * @param value the write
	 */
	public void setWrite(final Boolean value)
	{
		setWrite( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.write</code> attribute. 
	 * @param value the write
	 */
	public void setWrite(final SessionContext ctx, final boolean value)
	{
		setWrite( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LanguageSkillInfo.write</code> attribute. 
	 * @param value the write
	 */
	public void setWrite(final boolean value)
	{
		setWrite( getSession().getSessionContext(), value );
	}
	
}
