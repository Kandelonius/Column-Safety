package com.learning.test.stringsimmutability;

public class StringMethodsUsage {

	public static void main(String[] args) {
		String s = "mynameisJava";
		
		System.out.println(s);
		
		s=s.replace('a', 'k');
		System.out.println(s);
		
		
		String s1 = "mynameisJava";
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.subSequence(s1.indexOf('e'),s1.length()));
		
		
		
	}

}
