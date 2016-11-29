/**
 *
 */
package com.cnk.travelogix.operations.services.impl;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.model.ModelService;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.operations.services.LockUnlockService;


/**
 * Lock unlock feature for All Model
 *
 */
public class TravelogixLockUnlockService implements LockUnlockService<ItemModel>
{
	@Autowired
	private ModelService modelService;

	private static final String LOCKED_BY = "lockedBy";

	@Override
	public void lock(final ItemModel object, final EmployeeModel user)
	{
		object.setProperty(LOCKED_BY, user);
		modelService.save(object);
	}

	@Override
	public void unlock(final ItemModel object, final EmployeeModel user)
	{
		if (object.getProperty(LOCKED_BY) != null && user.getUid().equals(((EmployeeModel) object.getProperty(LOCKED_BY)).getUid()))
		{
			object.setProperty(LOCKED_BY, null);
			modelService.save(object);
		}
	}

	@Override
	public boolean canLock(final ItemModel object)
	{
		return null == object.getProperty(LOCKED_BY);
	}

	@Override
	public boolean canUnlock(final ItemModel object, final EmployeeModel user)
	{
		return object.getProperty(LOCKED_BY) != null && object.getProperty(LOCKED_BY).equals(user);
	}
}
