package com.pactical.streamio;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	
	public static void main(String[] args) {
		try {
			FileOutputStream write = new FileOutputStream("C:\\Users\\Intel\\Desktop\\Yogesh\\notepad1\\Assignment3.txt");
			write.write(95);
			write.close();
			System.out.println("sucess!!!!!!!!");
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
