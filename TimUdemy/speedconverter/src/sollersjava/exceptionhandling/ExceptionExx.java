package com.learning.test.exceptionhandling;

public class ExceptionExx {

	public static void main(String[] args) {

		int a[]= {1,2,3,4}; // 4 (0-3)
		char s='a';
		int b =10;
		b=15;
		

		try {
			System.out.println(a[1]); //arrayIndexoutofBoundException
			System.out.println(a[5]);
			System.out.println(a[5]);
			System.out.println(a[5]);//StringIndexOutOfBoundsException
			System.out.println(a[5]);
			
			System.out.println(a[5]);
			
			System.out.println(a[5]);//ArithematicException
			
			
			
		}catch(ArrayIndexOutOfBoundsException|StringIndexOutOfBoundsException|ArithmeticException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured"+e.getMessage());
		}
		catch(ArrayStoreException e) {
			System.out.println("ArithmeticException occured"+e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}

}
