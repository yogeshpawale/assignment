package com.pactical.streamio;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStramReaderExample {

	public static void main(String[] args) {
		
		// creates an array of character
		
		char[] array = new char[90];
		
		
		// create a fileinputstream  
		try {
			
		
		FileInputStream file = new FileInputStream("C:\\Users\\Intel\\Desktop\\Yogesh\\notepad1\\Assignment5.txt");
		
		// create an inputstreamreader
		
		InputStreamReader reads = new InputStreamReader(file);
		
		reads.read(array);
		System.out.println("Data in the Stream");
		System.out.println(array);
		reads.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
}
