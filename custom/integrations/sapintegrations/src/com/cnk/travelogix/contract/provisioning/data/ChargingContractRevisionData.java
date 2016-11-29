
package com.cnk.travelogix.contract.provisioning.data;

import java.util.ArrayList;
import java.util.List;


public class ChargingContractRevisionData
{

	protected String id;
	protected String subscriberAccountId;
	protected String rootChargingContractId;
	protected List<AdditionalInfo> additionalInfo;
	protected List<ChargingContractItemRevision> chargingContractItemRevision;

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
	 * Gets the value of the subscriberAccountId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getSubscriberAccountId()
	{
		return subscriberAccountId;
	}

	/**
	 * Sets the value of the subscriberAccountId property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setSubscriberAccountId(final String value)
	{
		this.subscriberAccountId = value;
	}

	/**
	 * Gets the value of the rootChargingContractId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getRootChargingContractId()
	{
		return rootChargingContractId;
	}

	/**
	 * Sets the value of the rootChargingContractId property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setRootChargingContractId(final String value)
	{
		this.rootChargingContractId = value;
	}

	/**
	 * Gets the value of the additionalInfo property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the additionalInfo property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getAdditionalInfo().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link AdditionalInfo }
	 *
	 *
	 */
	public List<AdditionalInfo> getAdditionalInfo()
	{
		if (additionalInfo == null)
		{
			additionalInfo = new ArrayList<AdditionalInfo>();
		}
		return this.additionalInfo;
	}

	/**
	 * Gets the value of the chargingContractItemRevision property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the chargingContractItemRevision property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getChargingContractItemRevision().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ChargingContractItemRevision }
	 *
	 *
	 */
	public List<ChargingContractItemRevision> getChargingContractItemRevision()
	{
		if (chargingContractItemRevision == null)
		{
			chargingContractItemRevision = new ArrayList<ChargingContractItemRevision>();
		}
		return this.chargingContractItemRevision;
	}

}
