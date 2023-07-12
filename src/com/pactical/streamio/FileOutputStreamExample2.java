package com.pactical.streamio;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample2 {

	public static void main(String[] args) {
		
		byte names[] = {'Y','O','G','E','S','H',' ','P','A','W','A','L','E','\n'};
		String address = " at post-maldhon, tal-sinnar dist-nashik    \n";
		byte []add = address.getBytes();
		String education = "BE MECHANICAL ENGINEERING    \n";
		byte []edu = education.getBytes();
		
		FileOutputStream writers = null;
		
		try {
			writers = new FileOutputStream("C:\\Users\\Intel\\Desktop\\Yogesh\\notepad1\\Assignment1.txt");
			writers.write(names);
			writers.write(add);
			writers.write(edu);
			writers.close();
			System.out.println("Sucess!!!!!!!!!!!!!!!!");
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}
