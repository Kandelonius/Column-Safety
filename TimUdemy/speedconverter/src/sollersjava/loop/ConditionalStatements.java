package com.learning.test.loop;

public class ConditionalStatements {

	public static void main(String[] args) {

		int a=30;
		int b=20;
		
		if(a<b) {
			System.out.println("a is lessthan b");
		}else {
			System.out.println("a is not lessthan b");
		}
		
		if(a>b) {
			int c=40;
			System.out.println("a is greaterthan b");
			if(b>c) {
				System.out.println("b is greaterthan c");
			}else {
				System.out.println("not is greaterthan c");
			}	
			
		}
		
		switch(1) {
			
			case 1 : {
				System.out.println("1");
				System.out.println("1");
				System.out.println("1");
				System.out.println("1");
				System.out.println("1");
			}
			
			case 2 : {
				System.out.println("1");
				System.out.println("1");
				System.out.println("1");
				System.out.println("1");
				System.out.println("1");
				
			}
		}
		 
		
	}

}
