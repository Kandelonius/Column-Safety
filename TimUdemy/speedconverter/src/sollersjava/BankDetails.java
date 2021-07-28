package com.learning.test;

import java.io.Serializable;

public class BankDetails implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 166365365;
	int accountid;
	String password;   //Serializable  - Object format into byte format  -bankdetailsobj -> 01001001 (166365365)-> n/w -> client machine
	String name;      //Deserialization - byte format to object format  -(166365365) 010101010 -> object  -> accountid
	
	
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {  //setter injection
		this.accountid = accountid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) { //setter injection
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) { //setter injection
		this.name = name;
	}
	
	
}
