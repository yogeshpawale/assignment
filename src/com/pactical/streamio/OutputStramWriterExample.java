package com.pactical.streamio;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStramWriterExample {

	public static void main(String[] args) {
		
		String str = "my name is yogesh pawale i have java developer ";
		
		try {
			FileOutputStream writes = new FileOutputStream("C:\\Users\\Intel\\Desktop\\Yogesh\\notepad1\\Assignment6.txt");
			
			OutputStreamWriter data = new OutputStreamWriter(writes);
			
			data.write(str);
			System.out.println("Sucess!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			data.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}
