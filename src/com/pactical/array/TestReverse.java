package com.pactical.array;

public class TestReverse {

	 public static void main(String[] args) {
		
		 String str = "Welcome to velocity Pune";
		 char []arr = str.toCharArray();
		 String str1 = "";
		 for(char x:arr) {
			 str1 =x + str1;       //adds each character in front of the existing string
		 }
		 System.out.print(str1);
	}
}
