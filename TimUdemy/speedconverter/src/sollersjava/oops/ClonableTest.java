package com.learning.test.oops;

import java.io.Serializable;

class StudentData implements Cloneable{  
	
    int rollno;  
    String name;  
    
    StudentData(int rollno,String name){  
        this.rollno=rollno;  
        this.name=name;  
    }  
    
    public Object clone()throws CloneNotSupportedException{     
        return super.clone();  
    }  
}

class ClonableTest{
	public static void main(String[] args) {
		try{  
			StudentData s1=new StudentData(101,"Lissa");  
	        //clone the s1 object
			StudentData s2=(StudentData)s1.clone();  
	   
	        System.out.println("Original Student object: " + s1.rollno+" "+s1.name);  
	        System.out.println("Cloned Student object: " + s2.rollno+" "+s2.name);  
	   
	    }catch(CloneNotSupportedException c){}  
	}
}
 
