
package com.cnk.travelogix.contract.provisioning.data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;



public class ChargingContractItemRevision
{

	protected String chargePlanClassId;
	protected String refillPlanClassId;
	protected String id;
	protected String externalId;
	protected XMLGregorianCalendar end;
	protected List<ChargingContractItemSharedCounter> sharedCounter;
	protected List<ChargingContractItemPooledCounter> pooledCounter;
	protected List<ChargingContractItemParameter> parameter;
	protected List<ChargingContractItemUserTechnicalIdentifier> userTechnicalIdentifier;
	protected List<ChargingContractItemRevisionAccountAssignment> accountAssignment;

	/**
	 * Gets the value of the chargePlanClassId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getChargePlanClassId()
	{
		return chargePlanClassId;
	}

	/**
	 * Sets the value of the chargePlanClassId property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setChargePlanClassId(final String value)
	{
		this.chargePlanClassId = value;
	}

	/**
	 * Gets the value of the refillPlanClassId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getRefillPlanClassId()
	{
		return refillPlanClassId;
	}

	/**
	 * Sets the value of the refillPlanClassId property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setRefillPlanClassId(final String value)
	{
		this.refillPlanClassId = value;
	}

	/**
	 * Gets the value of the id property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Sets the value of the id property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setId(final String value)
	{
		this.id = value;
	}

	/**
	 * Gets the value of the externalId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getExternalId()
	{
		return externalId;
	}

	/**
	 * Sets the value of the externalId property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setExternalId(final String value)
	{
		this.externalId = value;
	}

	/**
	 * Gets the value of the end property.
	 *
	 * @return possible object is {@link XMLGregorianCalendar }
	 *
	 */
	public XMLGregorianCalendar getEnd()
	{
		return end;
	}

	/**
	 * Sets the value of the end property.
	 *
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 *
	 */
	public void setEnd(final XMLGregorianCalendar value)
	{
		this.end = value;
	}

	/**
	 * Gets the value of the sharedCounter property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the sharedCounter property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getSharedCounter().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ChargingContractItemSharedCounter }
	 *
	 *
	 */
	public List<ChargingContractItemSharedCounter> getSharedCounter()
	{
		if (sharedCounter == null)
		{
			sharedCounter = new ArrayList<ChargingContractItemSharedCounter>();
		}
		return this.sharedCounter;
	}

	/**
	 * Gets the value of the pooledCounter property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the pooledCounter property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getPooledCounter().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ChargingContractItemPooledCounter }
	 *
	 *
	 */
	public List<ChargingContractItemPooledCounter> getPooledCounter()
	{
		if (pooledCounter == null)
		{
			pooledCounter = new ArrayList<ChargingContractItemPooledCounter>();
		}
		return this.pooledCounter;
	}

	/**
	 * Gets the value of the parameter property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the parameter property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getParameter().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ChargingContractItemParameter }
	 *
	 *
	 */
	public List<ChargingContractItemParameter> getParameter()
	{
		if (parameter == null)
		{
			parameter = new ArrayList<ChargingContractItemParameter>();
		}
		return this.parameter;
	}

	/**
	 * Gets the value of the userTechnicalIdentifier property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the userTechnicalIdentifier property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getUserTechnicalIdentifier().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ChargingContractItemUserTechnicalIdentifier }
	 *
	 *
	 */
	public List<ChargingContractItemUserTechnicalIdentifier> getUserTechnicalIdentifier()
	{
		if (userTechnicalIdentifier == null)
		{
			userTechnicalIdentifier = new ArrayList<ChargingContractItemUserTechnicalIdentifier>();
		}
		return this.userTechnicalIdentifier;
	}

	/**
	 * Gets the value of the accountAssignment property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the accountAssignment property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getAccountAssignment().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ChargingContractItemRevisionAccountAssignment }
	 *
	 *
	 */
	public List<ChargingContractItemRevisionAccountAssignment> getAccountAssignment()
	{
		if (accountAssignment == null)
		{
			accountAssignment = new ArrayList<ChargingContractItemRevisionAccountAssignment>();
		}
		return this.accountAssignment;
	}

}
