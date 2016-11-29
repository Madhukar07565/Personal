package com.cnk.travelogix.exception.commonlogging.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * The Interface Auditable.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(
{ ElementType.METHOD, ElementType.TYPE })
public @interface Auditable
{

	/**
	 * The Enum AuditingActionType.
	 */
	public enum AuditingActionType
	{

		/** The user logged in. */
		USER_LOGGED_IN,
		/** The user logged out. */
		USER_LOGGED_OUT,
		/** The add item to cart. */
		ADD_ITEM_TO_CART,
		/** The update item from cart. */
		UPDATE_ITEM_FROM_CART,
		/** The show cart. */
		SHOW_CART,
		/** The place order. */
		PLACE_ORDER,
		/** The simulate order. */
		SIMULATE_ORDER,
		/** The process epayment. */
		PROCESS_EPAYMENT,
		/** The submit epayment. */
		SUBMIT_EPAYMENT,
		/** The confirm epayment. */
		CONFIRM_EPAYMENT,
		/** The delete payment relation. */
		DELETE_PAYMENT_RELATION,
		/** The create payment relation. */
		CREATE_PAYMENT_RELATION,
		/** The password reset. */
		PASSWORD_RESET,
		/** The update password. */
		UPDATE_PASSWORD,
		/** The reference payment update. */
		REFERENCE_PAYMENT_UPDATE,
		/** The show cart. */
		UPDATE_CART_QUANTITY
	}

	/**
	 * Action type.
	 *
	 * @return the auditing action type
	 */
	AuditingActionType actionType();


}
