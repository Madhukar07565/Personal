/**
 * 
 */
package com.cnk.travelogix.b2c.storefront.forms;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.cnk.travelogix.b2c.facades.wallet.impl.ValidationFailedException;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * status: "OK" or "Error"
 * 
 * setMessage: used to present a global message. if status is "OK", this is success message,  if status is "Error", this will
 * 				be the global error message
 * addInfo : if status is "Error", this method used to add field related error message.
 * 
 * @author i054410
 *
 */
public class ResponseMessage implements Serializable
{
	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = 1L;
	private String status;
	private Map map = new HashMap<>();
	
	public ResponseMessage(){}
	
	public ResponseMessage(String status){
		this.status = status;
	}
	
	public ResponseMessage(ValidationFailedException vfe){
		
		this.status = "Error";
		this.setMessage(vfe.getMessage());
		if(vfe.getErrorMap().size() > 0){
			this.map = vfe.getErrorMap();
		}
		
	}
	
	
	/**
	 * @return the status
	 */
	public String getStatus()
	{
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status)
	{
		this.status = status;
	}
	/**
	 * @return the map
	 */
	public Map getMap()
	{
		return map;
	}
	/**
	 * @param map the map to set
	 */
	public void setMap(HashMap map)
	{
		this.map = map;
	}
	@JsonIgnore
	public ResponseMessage changeStatus(String status){
		
		this.status = status;
		return this;
	}
	@JsonIgnore
	public ResponseMessage setMessage(String message){
		this.map.put("__message__", message);
		return this;
	}
	@JsonIgnore
	public ResponseMessage addInfo(String key, String message){
		this.map.put(key, message);
		return this;
	}
	
	public boolean hasError(){
		return "Error".equalsIgnoreCase(status);
		
	}
	
	
}
