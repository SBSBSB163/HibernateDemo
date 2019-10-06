package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo {
	@Id
	private int id;
	private String name;
	private String password;
	private String emailid;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(int id, String name, String password, String emailid) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", password=" + password + ", emailid=" + emailid + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	

}
