package com.learning.test.oops.inheritance;

public class Person {  
	
	{
		System.out.println("I am a instance block");
	}

	static {
		System.out.println("I am a static block");
	}

	//member variables
	String name;  //jessi  		//ravi
	int id;      //1   				//2
	int age;     //20  			//40
	String city;  //xyz  		//xyz
	char gender;  //F   		//M
	


	public Person() {//default constructor - jvm

	}

	//parameterized constructor - initialize the instance variables
	public Person(String name,int id,int age,String city,char gender) {//parameterized constructor - constructor injection
		this.name=name;
		this.id=id;
		this.age=age;
		this.city=city;
		this.gender=gender;
	}


	//member methods
	public String getpersonName(){
		return this.name;
	}


	public void eat() {
		int c =10;
		System.out.println("This is eat method"+name+c);
	}

	public void sleep() {
		String c=null;
		System.out.println("This is sleep method"+name+c);
	}

	public void walk() {
		System.out.println("This is walk method");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	

}
