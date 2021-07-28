package com.learning.test.oops.inheritance;

public class Women extends Person{

	 String occupation;
	 String husbandName;
	 int childCount;
	
	
	protected String getOccupation() {
		return occupation;
	}
	protected void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	protected String getHusbandName() {
		return husbandName;
	}
	protected void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}
	protected int getChildCount() {
		return childCount;
	}
	protected void setChildCount(int childCount) {
		this.childCount = childCount;
	}
	
	
	public void walk() {
		System.out.println("This is walk method");
	}

	
}
