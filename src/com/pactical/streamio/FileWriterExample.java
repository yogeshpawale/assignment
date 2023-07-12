package com.pactical.streamio;


import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		
		String strs = "this is the data from the source of velocity";
		
		try {
			
			FileWriter data = new FileWriter("C:\\Users\\Intel\\Desktop\\Yogesh\\notepad1\\Assignment7.txt");
			data.write(strs);
			System.out.println("done!!!!!!!!!!!!!!!!!");
			data.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}
}
