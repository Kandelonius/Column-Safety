package com.learning.test.oops.inheritance;

public class LoginUser {

	public static void main(String[] args) {

		User user = new User();
		String username = user.getUserName();
		String password = user.getPassword();


	}

	//validate
	public boolean validateUser() {
		if(true) {
			 String username = null;   // not empty or null  //regex validation = (0-9 a-z A-Z @)  => $#%
			 String password = null;  // not empty or null
			return true;
		}
		else {
			return false;
		}
	}
	
	//check whether username & password matches with the details in our server
	//database
	public boolean checkValidUserOrNot() {
		boolean authenticated=false;
		boolean validated = validateUser();
		if(validated) {
			 authenticated = databaseCall();
			if(authenticated) {
				redirect();
			}else {
				System.out.println("Wrong Username or Password");
			}
		}else {
			System.out.println("Invalid User details");
			return false;
		}
		return false;
	}
	

	private boolean databaseCall() {
	  //check wther user valid in our server
		return true;
		
	}

	public void redirect(){
		//redirect -> homepage once user credentails is success authenticated
	}
	
	public boolean validateUser(String username,String password,String email) {
		if(true) {
			 username = null;   // not empty or null  //regex validation = (0-9 a-z A-Z @)  => $#%
			 password = null;  // not empty or null
			 email=null;
			return true;
		}
		else {
			return false;
		}
	}


}
