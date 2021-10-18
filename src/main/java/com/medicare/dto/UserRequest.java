package com.medicare.dto;



public class UserRequest {
	private String email;
	private String username;
	private String password;
	private String name;
	private String role;
	private Boolean isEnabled;
	private String address;
	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRequest(String email, String username, String password, String name, String role, Boolean isEnabled,
			String address) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.name = name;
		this.role = role;
		this.isEnabled = isEnabled;
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Boolean getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
