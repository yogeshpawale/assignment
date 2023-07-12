package com.pactical.streamio;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample1 {

	public static void main(String[] args) {
	
        byte cities[] = {'P','U','N','E',' ','V','E','L','O','C','I','Y','\n'};
		
		String str = "learnig a java i/o 123....\n";
		
		byte strs[] = str.getBytes();
		
		FileOutputStream write = null;
		
	try {
		
		write = new FileOutputStream("C:\\Users\\Intel\\Desktop\\Yogesh\\notepad1\\Assignment2.txt");
		write.write(cities);
		write.write(strs);
		write.close();
		System.out.println("done!!!!!");
	} catch(IOException e) {
		System.out.println(e);
	}
	
	
	}
		
}
