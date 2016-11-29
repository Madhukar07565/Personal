package com.cnk.travelogix.core.livesupporti.client.dto;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Agent {

	@JsonProperty("Id")
	public int id;
	@JsonProperty("Email")
	public String email;
	@JsonProperty("Name")
	public String name;
	@JsonProperty("FirstName")
	public String firstName;
	@JsonProperty("LastName")
	public String lastName;
	@JsonProperty("CreationDate")
	public String creationDate;
	@JsonProperty("JobTitle")
	public String jobTitle;
	@JsonProperty("Groups")
	public List<Integer> groups = new ArrayList<>();
	@JsonProperty("Password")
	public String password;
	@JsonProperty("CurrentPassword")
	public String currentpassword;

	
	@JsonIgnore
	public int getId() {
		return id;
	}
	@JsonIgnore
	public void setId(int id) {
		this.id = id;
	}
	@JsonIgnore
	public String getEmail() {
		return email;
	}
	@JsonIgnore
	public void setEmail(String email) {
		this.email = email;
	}
	@JsonIgnore
	public String getName() {
		return name;
	}
	@JsonIgnore
	public void setName(String name) {
		this.name = name;
	}
	@JsonIgnore
	public String getFirstName() {
		return firstName;
	}
	@JsonIgnore
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@JsonIgnore
	public String getLastName() {
		return lastName;
	}
	@JsonIgnore
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@JsonIgnore
	public String getCreationDate() {
		return creationDate;
	}
	@JsonIgnore
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	@JsonIgnore
	public String getJobTitle() {
		return jobTitle;
	}
	@JsonIgnore
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@JsonIgnore
	public String getPassword() {
		return password;
	}
	
	@JsonIgnore
	public List<Integer> getGroups() {
		return groups;
	}
	
	@JsonIgnore
	public void setGroups(List<Integer> groups) {
		this.groups = groups;
	}
	@JsonIgnore
	public void setPassword(String password) {
		this.password = password;
	}
	@JsonIgnore
	public String getCurrentpassword() {
		return currentpassword;
	}
	@JsonIgnore
	public void setCurrentpassword(String currentpassword) {
		this.currentpassword = currentpassword;
	}

}