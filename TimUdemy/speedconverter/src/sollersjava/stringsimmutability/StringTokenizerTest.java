package com.learning.test.stringsimmutability;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("my name is Java"," ");  
		
		
		while (st.hasMoreTokens()) {  
			System.out.println(st.nextToken());  
		}  
		
		System.out.println("--------------------------------");
		
		
		StringTokenizer st1 = new StringTokenizer("2021-07-20","-");  
		while (st1.hasMoreTokens()) {  
			System.out.println(st1.nextToken());  
		}  

	}

}
