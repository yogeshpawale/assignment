package com.pactical.deserilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStudents {

	public static void main(String[] args) {
		
		try {
			Students s1 = new Students(11, 'A', "Yogesh");
			Students s2 = new Students(12, 'B', "Vikas");
			Students s3 = new Students(13, 'C', "Vaishanvi");
			Students s4 = new Students(14, 'D', "Suraj");
			Students s5 = new Students(15, 'E', "Vishal");
			
			FileOutputStream file = new FileOutputStream("C:\\Users\\Intel\\Desktop\\Yogesh\\notepad1\\Assignment8.txt");
			ObjectOutputStream datas = new ObjectOutputStream(file);
			datas.writeObject(s1);
			datas.writeObject(s2);
			datas.writeObject(s3);
			datas.writeObject(s4);
			datas.writeObject(s5);
			datas.flush();
			datas.close();
			System.out.println("done!!!!!!!!!!!!");
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
