package com.example.mobileshoppingassistant;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Users {
	@SerializedName("users")
	private List<User> users = new ArrayList<User>();

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	

}
