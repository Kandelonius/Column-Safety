package com.learning.test;

public class AccessSpecImplAccessor {

	public static void main(String[] args) {
		
		AccessSpec.test();
		
		
		AccessSpec object = new AccessSpec(30,20);  //creation of object   // constructor injection
		
		int returedValue = object.defaultAdd();
		int retrun = object.protectedAdd();
		int a = object.publicAdd(20,40);  //parameterized method
		
		System.out.println(returedValue);
		System.out.println(retrun);
		System.out.println(a);
		
		System.out.println(object.defaultAdd());
//		System.out.println(object.privateAdd());    //private methods can be access only in same class.
		System.out.println(object.protectedAdd());
		System.out.println(object.publicAdd(20,30));
	}
	
//	static ,abstract,final,native,transcient,volatile,syncronized,strictfp  - modifiers/specifiers

}



