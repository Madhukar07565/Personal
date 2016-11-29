/**
 *
 */
package com.cnk.travelogix.operations.services;

import de.hybris.platform.core.model.user.EmployeeModel;


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
	 */
	void lock(T object, EmployeeModel user);

	/**
	 * Unlock a Object for editing
	 *
	 * @param object
	 * @param user
	 */
	void unlock(T object, EmployeeModel user);

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
