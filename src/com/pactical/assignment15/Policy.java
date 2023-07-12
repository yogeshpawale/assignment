package com.pactical.assignment15;

import java.util.Scanner;

public class Policy {
//
//	1.1 Design the Policy class that contain policy id, policy name, policy type, premium amount etc. 
//	1.2 Design the below method into Policy class and which return the policy object
//	public Policy getPolicyDetails() 
//	1.3 Input should be taken from user and print that data into getPolicyDetails () method.
	
	int policyId;
	String policyName;
	String policyType;
	int premiumAmount;
	
	public Policy getPolicyDetails() {

		
		System.out.println("policy id");
		System.out.println("policy name");
		System.out.println("policy type");
		System.out.println("premium amount");
		return this;
	}
public static void main( String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Policy obj1 = new Policy();
	
	System.out.println("Enter the policy Id is : " +obj1.policyId);
	obj1.policyId = sc.nextInt();
	System.out.println("Enter the policy Name is : "+obj1.policyName);
	obj1.policyName = sc.next();
	System.out.println("Enter the policy Type is : "+obj1.policyType);
	obj1.policyType = sc.next();
	System.out.println("Enter the policy Premium Amount is : "+obj1.premiumAmount);
	obj1.premiumAmount = sc.nextInt();
	obj1.getPolicyDetails();
	
}
}
