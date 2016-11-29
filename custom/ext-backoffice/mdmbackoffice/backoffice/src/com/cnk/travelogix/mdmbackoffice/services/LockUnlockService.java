/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.services;

import de.hybris.platform.core.model.user.EmployeeModel;

import com.hybris.cockpitng.dataaccess.facades.object.exceptions.ObjectSavingException;


/**
 * To lock and unlock a Object
 * 
 * @param <T>
 */
public interface LockUnlockService<T>
{
	/**
	 * Lock a Object from editing
	 *
	 * @param object
	 * @param user
	 * @throws ObjectSavingException
	 */
	void lock(T object, EmployeeModel user) throws ObjectSavingException;

	/**
	 * Unlock a Object for editing
	 *
	 * @param object
	 * @param user
	 * @throws ObjectSavingException
	 */
	void unlock(T object, EmployeeModel user) throws ObjectSavingException;

	/**
	 * Can perform locking
	 *
	 * @param object
	 * @return boolean value
	 */
	boolean canLock(final T object);

	/**
	 * Can perform unlock
	 *
	 * @param object
	 * @param user
	 * @return boolean value
	 */
	boolean canUnlock(final T object, EmployeeModel user);
}
