package com.pactical.demo;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String str = "welcome to pune city & pune is the most beutifull city";
		
		String str1 = str.replace(" ","");
		char [] a= str1.toCharArray();
		int count;
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]=='0') {
				continue;
			}
			count=1;
			for(int j=i+1; j<=a.length-1; j++) {
				if(a[i]==a[j] && a[i]!='0') {
					count++;
					a[j]='0';
				}
			}
			if(count>1) {
				System.out.println(a[i]+" "+count);
			}
		
		}
	
	}
}
