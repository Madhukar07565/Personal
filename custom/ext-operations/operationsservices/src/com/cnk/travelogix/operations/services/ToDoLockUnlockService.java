/**
 *
 */
package com.cnk.travelogix.operations.services;

import de.hybris.platform.core.model.user.UserModel;


/**
 * To lock and unlock a Object
 *
 * @param <T>
 */
public interface ToDoLockUnlockService<T>
{
	/**
	 * Lock a Object from editing
	 *
	 * @param object
	 * @param user
	 * @throws ObjectSavingException
	 */
	void lock(T object, UserModel user);

	/**
	 * Unlock a Object for editing
	 *
	 * @param object
	 * @param user
	 * @throws ObjectSavingException
	 */
	void unlock(T object, UserModel user);

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
	boolean canUnlock(final T object, UserModel user);
}
