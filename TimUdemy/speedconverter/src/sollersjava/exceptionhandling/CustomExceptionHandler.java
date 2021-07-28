package com.learning.test.exceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionHandler {

	public static void main(String[] args) throws StringNotFound {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> obj = Arrays.asList("xyz","abc");
		
		System.out.println("Enter String :");
		String name = sc.next();
		
		if(!obj.contains(name)) {
			throw new StringNotFound("Given String not found");
		}else {
			System.out.println("String found");
		}
		
		System.out.println("String found jjshhsh");

	}

}
