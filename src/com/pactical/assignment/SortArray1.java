package com.pactical.assignment;

import java.util.Arrays;

public class SortArray1 {

	// for asscending & descending order
//	public static void main(String[] args) {
//		
//		int a[] = {15,20,10,25,5,11,58,63};
//		
//		for(int i=0; i<=a.length-1; i++) {
//			
//			System.out.println(a[i]);
//		}
//		System.out.println("===============length of array=====================");
//	System.out.println(a.length);
//		// ascending order
//		
//		System.out.println("========== ascending order=================");
//		
//		Arrays.sort(a);
//		for(int i=0; i<=7; i++) {
//			System.out.println(a[i]);
//		}
//		System.out.println("===========desceding order==================");
//		for(int i=7; i>=0; i--) {
//			System.out.println(a[i]);
//		}
//	}
	
	public static void main(String[] args){
		 int a[] = {10,5,17,18,16,9,7};



		Arrays.sort(a);

		for(int i=0; i<=6; i++){
		System.out.println(a[i]);

		}

		for(int i=6; i>=0; i--){

		System.out.println(a[i]);
		}

		}
}
