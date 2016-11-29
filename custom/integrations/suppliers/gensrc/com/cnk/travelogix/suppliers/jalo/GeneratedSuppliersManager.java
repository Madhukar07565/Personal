/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.suppliers.jalo;

import com.cnk.travelogix.suppliers.constants.SuppliersConstants;
import com.cnk.travelogix.suppliers.jalo.CheckFileStatusCronJob;
import com.cnk.travelogix.suppliers.jalo.SendFileStatusProcess;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SuppliersManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSuppliersManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public CheckFileStatusCronJob createCheckFileStatusCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersConstants.TC.CHECKFILESTATUSCRONJOB );
			return (CheckFileStatusCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CheckFileStatusCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public CheckFileStatusCronJob createCheckFileStatusCronJob(final Map attributeValues)
	{
		return createCheckFileStatusCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public SendFileStatusProcess createSendFileStatusProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliersConstants.TC.SENDFILESTATUSPROCESS );
			return (SendFileStatusProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SendFileStatusProcess : "+e.getMessage(), 0 );
		}
	}
	
	public SendFileStatusProcess createSendFileStatusProcess(final Map attributeValues)
	{
		return createSendFileStatusProcess( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SuppliersConstants.EXTENSIONNAME;
	}
	
}
