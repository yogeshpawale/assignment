package com.pactical.streamio;

import java.io.FileInputStream;

public class FileInputStreamExample {

	
	// to read a single character
	
	public static void main(String[] args) {
		
		try {
			FileInputStream read = new FileInputStream("C:\\Users\\Intel\\Desktop\\Yogesh\\notepad1\\Assignment4.txt");
			int i = read.read();
			System.out.println(i);
			System.out.println((char) i);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
