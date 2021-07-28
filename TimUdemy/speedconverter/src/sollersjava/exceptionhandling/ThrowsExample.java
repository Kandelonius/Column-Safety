package com.learning.test.exceptionhandling;

import java.io.IOException;

public class ThrowsExample {

	void m()throws IOException,ArrayIndexOutOfBoundsException{  
		throw new IOException("device error");//checked exception  
	}


	void n()throws IOException{  
		m();  
	} 


	void p(){  
		try{  
			n();  
		}catch(Exception e){
			System.out.println("exception handled");
		}finally {
			System.out.println("finally block executed");
		}
	}  


	public static void main(String args[]){ 

		ThrowsExample obj=new ThrowsExample();  

		obj.p();  //program will stop executing if dont have try & catch for p()

		System.out.println("normal flow...");  
	}  
}
