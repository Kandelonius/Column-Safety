package com.learning.test.stringsimmutability;

public class StringImmutableInJava {

	public static void main(String[] args) {
		String s="Sachin";  
		
		s.concat(" Tendulkar");
		                 //concat() method appends the string at the end  
		System.out.println(s);  //will print Sachin because strings are immutable objects  
		
		s=s.concat(" Tendulkar");
		System.out.println(s);
	}

}
