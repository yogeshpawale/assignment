package com.pactical.deserilization;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class DeserilizationStudent {

	public static void main(String[] args) { 
		
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Intel\\Desktop\\Yogesh\\notepad1\\Assignment8.txt");
			ObjectInputStream data = new ObjectInputStream(file);
			Object obj1 = data.readObject();
			Object obj2 = data.readObject();
			Object obj3 = data.readObject();
			Object obj4 = data.readObject();
			Object obj5 = data.readObject();
			
			Students s1 = (Students) obj1;
			Students s2 = (Students) obj2;
			Students s3 = (Students) obj3;
			Students s4 = (Students) obj4;
			Students s5 = (Students) obj5;
			
			System.out.println(s1.rollno + " " +s1.names +" " + s1.division);
			System.out.println(s2.rollno + " " +s2.names +" " + s2.division);
			System.out.println(s3.rollno + " " +s3.names +" " + s3.division);
			System.out.println(s4.rollno + " " +s4.names +" " + s4.division);
			System.out.println(s5.rollno + " " +s5.names +" " + s5.division);
			data.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
