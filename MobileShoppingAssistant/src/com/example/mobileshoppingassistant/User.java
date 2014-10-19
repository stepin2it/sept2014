package com.example.mobileshoppingassistant;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by coder on 10/4/14.
 */
public class User implements Serializable{
	

	@SerializedName("first_name")
    private String first_name;
	@SerializedName("last_name")
    private String last_name;
	@SerializedName("phone_number")
    private String phone_number;
	@SerializedName("email_address")
    private String email_address;
	@SerializedName("notes")
    private String notes;
    
	public User(String firstName, String lastName, String phoneNumber,
			String emailAddress, String notes) {
		super();
		this.first_name = firstName;
		this.last_name = lastName;
		this.phone_number = phoneNumber;
		this.email_address = emailAddress;
		this.notes = notes;
	}
	public User(String firstName, String phoneNumber) {
		super();
		this.first_name = firstName;
		this.phone_number = phoneNumber;
	}
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	public String getPhoneNumber() {
		return phone_number;
	}
	public void setPhoneNumber(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmailAddress() {
		return email_address;
	}
	public void setEmailAddress(String email_address) {
		this.email_address = email_address;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
	
}
