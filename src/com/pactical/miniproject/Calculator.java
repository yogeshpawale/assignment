package com.pactical.miniproject;

import java.util.Scanner;

public class Calculator implements OperationOfCalculator {
	static int result;
	int first_value, second_value, third_value, fourth_value, fifth_value, selection,number;

  

	@Override
	public int getAddition(int a, int b) {
		result = a+b;
		return result;
		
	}

	@Override
	public int getSubstraction(int a, int b) {
		
		 result = a-b;
		return result;
	}

	@Override
	public int getMultiplication(int a, int b) {
		
	 result = a*b;
		return result;
	}
	@Override
	public int getDivision(int a, int b) {
		
		 result = a/b;
		return result;
	}
	
	@Override
	public int getModulus(int a, int b) {
		
		 result = a%b;
		return result;
		
		
	}

	@Override
	public int getSquare(int a) {
	
		result =a*a;
		
		return result;
	}

	@Override
	public int getCube(int a) {
		
		result = a*a*a;
		return result;
	}
	

	@Override
	public float getAverage(float a, float b, float c, float d, float e) {
		float total = a+b+c+d+e;
		float result = total/5;
		return result;
	}

	@Override
	public int getFactorOfNumber(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEvenOrOddNumber(int a) {
	
		return result;
	}

	public void calciOperation() {
         
		
		System.out.println("please select the which operation perform \n 1 .addition    \n 2 .substraction  \n 3 .multiplication \n 4 .division  \n 5 .modulus \n 6 .square \n 7 .cube \n 8 .Average \n 9 .Factor of number \n 10 .Odd or Even number");
		Scanner sc = new Scanner(System.in);
		System.out.println("select the opertion to be performed");
	
		
	    try {
					selection = sc.nextInt();
				}catch(Exception e) {
					System.out.println("please enter the valid input ");
				}
			 
		
			
				Calculator calci = new Calculator();	
				
		    if(selection==1) {
		    	System.out.println("ener the first value");
				first_value = sc.nextInt();
					
				System.out.println("enter the second value");
				second_value = sc.nextInt();
					
				System.out.println("first value is :" +first_value);
				System.out.println("first value is :" +second_value);
		    	calci.getAddition(first_value, second_value);
//		    	result = first_value + second_value;
		    	System.out.println("Addition is >> "+result);
		    }
			
		    else if(selection==2) {
		    	System.out.println("ener the first value");
				first_value = sc.nextInt();
					
				System.out.println("enter the second value");
				second_value = sc.nextInt();
					
				System.out.println("first value is :" +first_value);
				System.out.println("first value is :" +second_value);
		    	calci.getSubstraction(first_value, second_value);
//		    	result = first_value - second_value;
		    	System.out.println("Sustraction is >> "+result);
		    }
		    else if(selection==3) {
		    	System.out.println("ener the first value");
			    first_value = sc.nextInt();
					
				System.out.println("enter the second value");
			    second_value = sc.nextInt();
					
				System.out.println("first value is :" +first_value);
				System.out.println("first value is :" +second_value);
		    	calci.getMultiplication(first_value, second_value);
//		    	result = first_value * second_value;
		    	System.out.println("Multiplication is >> "+result);
		    }
		  else if(selection==4) {
			  System.out.println("enter the first value");
			  first_value = sc.nextInt();
					
			  System.out.println("enter the second value");
			  second_value = sc.nextInt();
					
			  System.out.println("first value is :" +first_value);
			  System.out.println("first value is :" +second_value);
		      calci.getDivision(first_value, second_value);
//		      result = first_value / second_value;
		     System.out.println("Division is >> "+result);
		    }
		  else if(selection==5) {
		    	System.out.println("enter the first value");
				first_value = sc.nextInt();
					
				System.out.println("enter the second value");
				second_value = sc.nextInt();
					
				System.out.println("first value is :" +first_value);
				System.out.println("first value is :" +second_value);
		    	calci.getModulus(first_value, second_value);
//		    	result = first_value % second_value;
		    	System.out.println("Modulus is >> "+result);
		    }
		    
		     else if(selection==6) {
		    	 System.out.println("Enter the Number");
				 number = sc.nextInt();
					
				System.out.println("Number is :" +number);
				
		    	calci.getSquare(number);
//		    	result = number*number;
		    	System.out.println("Square is >> "+result);
		    } 
		     else if(selection==7) {
		    	 System.out.println("enter the Number");
				 number = sc.nextInt();
					
				System.out.println("Enter number is :" +number);
		    	calci.getCube(number);
//		    	result = number*number*number;
		    	System.out.println("Cube is >> "+result);
		    }
		     else if(selection==8) {
		    	 System.out.println("ener the first value");
				 first_value = sc.nextInt();
				 System.out.println("enter the second value");
				 second_value = sc.nextInt();
				 System.out.println("enter the third value");
				 third_value = sc.nextInt();
				 System.out.println("enter the fourth value");
				 fourth_value = sc.nextInt();
				 System.out.println("enter the fifth value");
				 fifth_value = sc.nextInt();
				 System.out.println("first value is :" +first_value);
				 System.out.println("first value is :" +second_value);
				 System.out.println("first value is :" +third_value);
				 System.out.println("first value is :" +fourth_value);
				 System.out.println("first value is :" +fifth_value);
					
				 
				 calci.getAverage(first_value, second_value, third_value, fourth_value, fifth_value);
				float total = first_value+second_value+third_value+fourth_value+fifth_value;
				float result = total/5;
		    	System.out.println("Average is >> "+result);
		    	
		     }
		     
		     else if(selection==9) {
		    	 System.out.println("ener the number");
				number = sc.nextInt();
				System.out.print("Factors of " + number + " are: ");
				calci.getFactorOfNumber(number);
 
				    for (int i = 1; i <= number; ++i) {

				  
				      if (number % i == 0) {
				      
				        System.out.print(i + ",");
				        
				      }
				    }
		     }
		     else if(selection==10) {
		    	 System.out.println("ener the number for checking");
				int number = sc.nextInt();
				calci.getEvenOrOddNumber(number);
				for(int i=number; i<=number; i++) {
					if(i%2==0) {
						System.out.println("It's even number");
					}else {
						System.out.println("It's  Odd number");
					}
				}
				
		     }else {
		    	 System.out.println("Enter the valid input & start the once again calculator");
		     }
		
		   
			sc.close();
			
	}
}
