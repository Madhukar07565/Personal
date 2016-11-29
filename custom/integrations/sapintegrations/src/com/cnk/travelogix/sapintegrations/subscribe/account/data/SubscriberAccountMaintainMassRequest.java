
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cnk.travelogix.custom.subscribe.account.SubscriberAccountMaintainRequest;


/**
 * <p>
 * Java class for SubscriberAccountMaintainMassRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SubscriberAccountMaintainMassRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schema.provisioning.ws.highdeal.com/}subscriberAccountMaintainRequest" maxOccurs="1000"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberAccountMaintainMassRequest", propOrder =
{ "subscriberAccountMaintainRequest" })
public class SubscriberAccountMaintainMassRequest
{

	@XmlElement(namespace = "http://schema.provisioning.ws.highdeal.com/", required = true)
	protected List<SubscriberAccountMaintainData> subscriberAccountMaintainRequest;

	/**
	 * Gets the value of the subscriberAccountMaintainRequest property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the subscriberAccountMaintainRequest property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getSubscriberAccountMaintainRequest().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link SubscriberAccountMaintainRequest }
	 *
	 *
	 */
	public List<SubscriberAccountMaintainData> getSubscriberAccountMaintainRequest()
	{
		if (subscriberAccountMaintainRequest == null)
		{
			subscriberAccountMaintainRequest = new ArrayList<SubscriberAccountMaintainData>();
		}
		return this.subscriberAccountMaintainRequest;
	}

}
