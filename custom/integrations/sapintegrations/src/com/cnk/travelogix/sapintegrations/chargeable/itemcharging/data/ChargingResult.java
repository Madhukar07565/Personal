
package com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data;

import java.util.ArrayList;
import java.util.List;



public class ChargingResult
{

	protected ChargingProcessInfo chargingProcessInfo;
	protected ChargingContractInfo chargingContractInfo;
	protected ChargeableItemInfo chargeableItemInfo;
	protected List<AccountOperation> accountOperation;
	protected List<ExternalAccountInfo> externalAccountInfo;
	protected List<PrepaidAccountInfo> prepaidAccountInfo;
	protected List<ChargedItem> chargedItem;
	protected List<Notification> notification;

	/**
	 * Gets the value of the chargingProcessInfo property.
	 * 
	 * @return possible object is {@link ChargingProcessInfo }
	 * 
	 */
	public ChargingProcessInfo getChargingProcessInfo()
	{
		return chargingProcessInfo;
	}

	/**
	 * Sets the value of the chargingProcessInfo property.
	 * 
	 * @param value
	 *           allowed object is {@link ChargingProcessInfo }
	 * 
	 */
	public void setChargingProcessInfo(final ChargingProcessInfo value)
	{
		this.chargingProcessInfo = value;
	}

	/**
	 * Gets the value of the chargingContractInfo property.
	 * 
	 * @return possible object is {@link ChargingContractInfo }
	 * 
	 */
	public ChargingContractInfo getChargingContractInfo()
	{
		return chargingContractInfo;
	}

	/**
	 * Sets the value of the chargingContractInfo property.
	 * 
	 * @param value
	 *           allowed object is {@link ChargingContractInfo }
	 * 
	 */
	public void setChargingContractInfo(final ChargingContractInfo value)
	{
		this.chargingContractInfo = value;
	}

	/**
	 * Gets the value of the chargeableItemInfo property.
	 * 
	 * @return possible object is {@link ChargeableItemInfo }
	 * 
	 */
	public ChargeableItemInfo getChargeableItemInfo()
	{
		return chargeableItemInfo;
	}

	/**
	 * Sets the value of the chargeableItemInfo property.
	 * 
	 * @param value
	 *           allowed object is {@link ChargeableItemInfo }
	 * 
	 */
	public void setChargeableItemInfo(final ChargeableItemInfo value)
	{
		this.chargeableItemInfo = value;
	}

	/**
	 * Gets the value of the accountOperation property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the accountOperation property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAccountOperation().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link AccountOperation }
	 * 
	 * 
	 */
	public List<AccountOperation> getAccountOperation()
	{
		if (accountOperation == null)
		{
			accountOperation = new ArrayList<AccountOperation>();
		}
		return this.accountOperation;
	}

	/**
	 * Gets the value of the externalAccountInfo property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the externalAccountInfo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getExternalAccountInfo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ExternalAccountInfo }
	 * 
	 * 
	 */
	public List<ExternalAccountInfo> getExternalAccountInfo()
	{
		if (externalAccountInfo == null)
		{
			externalAccountInfo = new ArrayList<ExternalAccountInfo>();
		}
		return this.externalAccountInfo;
	}

	/**
	 * Gets the value of the prepaidAccountInfo property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the prepaidAccountInfo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPrepaidAccountInfo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PrepaidAccountInfo }
	 * 
	 * 
	 */
	public List<PrepaidAccountInfo> getPrepaidAccountInfo()
	{
		if (prepaidAccountInfo == null)
		{
			prepaidAccountInfo = new ArrayList<PrepaidAccountInfo>();
		}
		return this.prepaidAccountInfo;
	}

	/**
	 * Gets the value of the chargedItem property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the chargedItem property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getChargedItem().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ChargedItem }
	 * 
	 * 
	 */
	public List<ChargedItem> getChargedItem()
	{
		if (chargedItem == null)
		{
			chargedItem = new ArrayList<ChargedItem>();
		}
		return this.chargedItem;
	}

	/**
	 * Gets the value of the notification property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the notification property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getNotification().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Notification }
	 * 
	 * 
	 */
	public List<Notification> getNotification()
	{
		if (notification == null)
		{
			notification = new ArrayList<Notification>();
		}
		return this.notification;
	}

}
