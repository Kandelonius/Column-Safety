package com.learning.test.stringsimmutability;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("java");  //non synchronised , high performance ,mulyithread
		builder.append(" java1");
		
		StringBuffer buffer = new StringBuffer("java1");   // synchronised , low performance ,mulyithread
		buffer.append(" java1");
		
		System.out.println(buffer);

	}

}
