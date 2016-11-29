
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import java.util.ArrayList;
import java.util.List;


public class Failure
{

	protected FailureCategory category;
	protected String message;
	protected FailureCause cause;
	protected List<FailureCause> causedBy;

	/**
	 * Gets the value of the category property.
	 *
	 * @return possible object is {@link FailureCategory }
	 *
	 */
	public FailureCategory getCategory()
	{
		return category;
	}

	/**
	 * Sets the value of the category property.
	 *
	 * @param value
	 *           allowed object is {@link FailureCategory }
	 *
	 */
	public void setCategory(final FailureCategory value)
	{
		this.category = value;
	}

	/**
	 * Gets the value of the message property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * Sets the value of the message property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setMessage(final String value)
	{
		this.message = value;
	}

	/**
	 * Gets the value of the cause property.
	 *
	 * @return possible object is {@link FailureCause }
	 *
	 */
	public FailureCause getCause()
	{
		return cause;
	}

	/**
	 * Sets the value of the cause property.
	 *
	 * @param value
	 *           allowed object is {@link FailureCause }
	 *
	 */
	public void setCause(final FailureCause value)
	{
		this.cause = value;
	}

	/**
	 * Gets the value of the causedBy property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the causedBy property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getCausedBy().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link FailureCause }
	 *
	 *
	 */
	public List<FailureCause> getCausedBy()
	{
		if (causedBy == null)
		{
			causedBy = new ArrayList<FailureCause>();
		}
		return this.causedBy;
	}

}
