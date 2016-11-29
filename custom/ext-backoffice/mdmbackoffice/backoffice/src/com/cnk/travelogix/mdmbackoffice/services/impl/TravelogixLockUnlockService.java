/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.services.impl;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.mdmbackoffice.services.LockUnlockService;
import com.hybris.cockpitng.dataaccess.facades.object.ObjectFacade;
import com.hybris.cockpitng.dataaccess.facades.object.exceptions.ObjectSavingException;
import com.hybris.cockpitng.util.BackofficeSpringUtil;


/**
 * Lock unlock featuree for Organization Model
 *
 */
public class TravelogixLockUnlockService implements LockUnlockService<ItemModel>
{
	private static final Logger LOG = Logger.getLogger(TravelogixLockUnlockService.class.getName());

	@Resource
	ModelService modelService;

	public ObjectFacade getObjectFacade()
	{
		return (ObjectFacade) BackofficeSpringUtil.getBean("objectFacade");
	}

	@Override
	public void lock(final ItemModel object, final EmployeeModel user) throws ObjectSavingException
	{
		object.setProperty("lockedBy", user);
		getObjectFacade().save(object);
	}

	@Override
	public void unlock(final ItemModel object, final EmployeeModel user) throws ObjectSavingException
	{
		modelService.refresh(object);

		if (object.getProperty("lockedBy") != null && user.getUid().equals(((UserModel) object.getProperty("lockedBy")).getUid()))
		{
			object.setProperty("lockedBy", null);
			getObjectFacade().save(object);
		}
	}

	@Override
	public boolean canLock(final ItemModel object)
	{
		return null == object.getProperty("lockedBy");
	}

	@Override
	public boolean canUnlock(final ItemModel object, final EmployeeModel user)
	{
		return object.getProperty("lockedBy") != null && object.getProperty("lockedBy").equals(user);
	}
}
