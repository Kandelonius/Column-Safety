package com.learning.test.oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{  
/**
	 * 
	 */
	private static final long serialVersionUID = 12345676;
	//	transient int id;  
//	transient String name;  
	int id;
	String name;
	public Student(int id, String name) {  
		this.id = id;  
		this.name = name;  
	}  
} 

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		 Student s1 =new Student(27,"Eddie");  
		  //Write the object to the stream by creating a output stream  
		  FileOutputStream fout=new FileOutputStream("C:/Users/IM-LP-1338/Downloads/Java-Sessions/test.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(s1);  
		  out.flush();  
		  out.close();  
		  System.out.println("Object successfully written to the file");  
		   
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:/Users/IM-LP-1338/Downloads/Java-Sessions/test.txt"));  
		  Student s=(Student)in.readObject();  
		  System.out.println("Student object: " + s.id+" "+s.name);  
		  in.close();  
		   
	}

}
