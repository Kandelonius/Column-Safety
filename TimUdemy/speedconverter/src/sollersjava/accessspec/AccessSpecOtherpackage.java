package com.learning.test.accessspec;

import com.learning.test.AccessSpec;

public class AccessSpecOtherpackage extends AccessSpec{

	
	public void accessProtected() {
		
		AccessSpec spec = new AccessSpec();  // created the object for AccessSpec class
		
//		System.out.println(spec.defaultAdd());   // default methods can be access only in same package
//		System.out.println(spec.privateAdd());    //private methods can be access only in same class.
//		System.out.println(spec.protectedAdd());  // we cant access protected method using an object
		System.out.println(spec.publicAdd(10,20));
//		spec.protectedAdd();   // we cant access protected method using an object
		System.out.println(protectedAdd());
		
		protectedAdd();
	}

}
