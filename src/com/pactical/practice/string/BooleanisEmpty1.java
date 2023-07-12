package com.pactical.practice.string;

public class BooleanisEmpty1 {
	
	
	public static void main(String[] args) {

		try {
			
		
			String str = null;
//			System.out.println(str.length());
			boolean results = str.isEmpty();
			if(results) {
				System.out.println("string is empty");
			} else {
				System.out.println("String is not Empty");
			}
			
		} catch(NullPointerException e) {     // str is null so on consol shows the java.lang.NullPointerException
			System.out.println(e);
		}
			
		
		
		
	}

}
