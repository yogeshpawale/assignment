package com.pactical.assignment7;

public class CubeClass {

	//  2. Design method public int getNumberCube(int num), return int value to that method and result should be into main method.
	
	public int getNumberCube(int num) {
		int result = num*num*num;
		System.out.println("number cube is : " +result);
		return result;
	}
	
	public static void main(String[] args) {
		
		CubeClass obj = new CubeClass();
		obj.getNumberCube(5);
		
	}
}
