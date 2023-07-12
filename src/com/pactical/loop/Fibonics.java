package com.pactical.loop;

public class Fibonics {

	public static void main(String[] args) {
//		int i =1;
//		int a=0;
//		int b=1;
//		
////		System.out.println(a);
////		System.out.println(b);   //0 , 1
//		while(i<=10) {
//			int c= a+b;    // c=0+1=1,   c= b 1+c 1 =2, c=c 1+ c 2 =3,  2+3=5, 3+5=8
//		
//			System.out.print(c +",");  // 1,
//		
//		 a=b;
//			b=c;	
//			i++;
//		}
//		
		
//		
//		for(int i=0;  i >= str.length()-1; i++) {
//			
//			for(int j=0;  j >= str.length()-1; j++) {
//				System.out.print(str.charAt(i) +",");
//			}
//			
//			
//		}
		String str = "yogeshy";
		
		for(int i=0; i>str.length();i++) {
		    
			  for(int j= i+1; j<=str.length();j++) {
			    	 if(str.charAt(i) == str.charAt(j)) {
			    		 System.out.println("Duplicate No. is:"+ str.charAt(i));
	}
			  }
			  }
		}
}
