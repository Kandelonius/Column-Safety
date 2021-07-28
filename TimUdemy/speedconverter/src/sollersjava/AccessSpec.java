package com.learning.test;

public class AccessSpec implements TestInterface {
	
	public AccessSpec() { //default constructor
		
	}
	
	int a;
	int b;
	int c;
	
	int accountid;
	String password; 
	
	public  AccessSpec(int x , int y) {  // parameterized constructor
		a=x;
		b=y;
	}
	
	public AccessSpec(String x,String y) {  //overloaded constructor
		
	}
	 
	public synchronized  int publicAdd(int x,int y) {  //lock
		c = x+y;
		return c;
	}
	
	private int privateAdd() {
		c = a+b;
		return c;
	}
	
    int defaultAdd() {
		c = a+b;
		return c;
	}
    
    protected int protectedAdd() {
    	c = a+b;
		return c;
    }
    
    static void test() {
    	
    }

	@Override
	public void testInterface() {
		System.out.println("sydgf");
		
	}

	@Override
	public int substract() {
		return 0;
	}

    
    
}
