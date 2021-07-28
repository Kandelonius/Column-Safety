package com.learning.test.oops.inheritance;

public class PersonObj {
	
	public static void main(String[] args) {
		
		Person p = new Person(); 
		p.setName("Jessi");  //setter injection
//		p.setId(1);  //setter injection
//		p.setAge(20);  //setter injection
//		p.setCity("xyz");  //setter injection
//		p.setGender('F');  //setter injection
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
//		System.out.println(p.getCity());
		System.out.println(p.getId());
		
		Person jessi = new Person("jessi", 1, 20, "xyz", 'F');  //parameterized constructor - constructor injection
//		jessi.age
		
		
		System.out.println(jessi.getpersonName());
		
//		Person ravi = new Person("ravi", 2, 40, "xyz", 'M');  //parameterized constructor - constructor injection
		
//		System.out.println(ravi.getpersonName());
		
		
		
	}
	

}
