package com.pactical.assignment3;

public class Assignment3 {

	//1. Design the separate method as String getStudentName (String name) which return student name and print it.
	
	
	public String getStudentName(String name) {
		System.out.println(name);
		return name;
	}
	
	public static void main(String[] args) {
		Assignment3 obj = new Assignment3();
		obj.getStudentName("yogesh");
		obj.getStudentName("ganesh");
	}
	
}
