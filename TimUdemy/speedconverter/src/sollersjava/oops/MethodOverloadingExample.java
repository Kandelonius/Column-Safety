package com.learning.test.oops;

public class MethodOverloadingExample {
	
	//method overloading -same method name, different method signature,different arguments/datatypes

	void sum(int a,long b){
		System.out.println("int - long invoked");
		System.out.println(a+b);
	}  
	
	void sum(int a,int b,int c){
		System.out.println("int - int -int  invoked");
		System.out.println(a+b+c);
	}  
	
	public static void main(String[] args) {
		MethodOverloadingExample obj=new MethodOverloadingExample();  
		  obj.sum(20,20);//now second int literal will be promoted to long  
		  obj.sum(20,20,20);
	}
}
