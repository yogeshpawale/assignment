package com.pactical.demo;

public class DuplicateElement {

	public void duplicateMehod() {
		
		int []a= {1,15,2,15,17,3,4,7,8,7,4,5,1,2,15,17};
		int count;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==Integer.MIN_VALUE) {
				continue;
			}
			count=1;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j] && a[j]!=Integer.MIN_VALUE) {
					count++;
					a[j]=Integer.MIN_VALUE;
				}
			}
			if(count>1) {
				System.out.println(a[i]+" "+count);
			}
		}
	} 
	
	public static void main(String[] args) {
		DuplicateElement obj = new DuplicateElement();
		obj.duplicateMehod();
		
	}
}
