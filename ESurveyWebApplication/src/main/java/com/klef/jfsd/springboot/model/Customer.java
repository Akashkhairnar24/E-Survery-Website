package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_table")
public class Customer {
	
	@GeneratedValue
	@Column(name="customer_id")
	private int id;
	@Column(nullable = false,name="customer_name",length=20)
	private String name;
	@Column(nullable = false,name="customer_emailid",unique = true,length=40)
	private String emailid;
	@Id
	@Column(nullable = false,name="customer_username",unique = true,length=20)
	private String username;
	@Column(nullable = false,name="customer_password",length=20)
	private String password;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", emailid=" + emailid + ", username=" + username
				+ ", password=" + password + "]";
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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
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
	
	
}
