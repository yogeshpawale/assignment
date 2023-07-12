package com.pactical.miniproject;

public interface OperationOfCalculator {

	
	
	public abstract int getAddition(int a, int b);
	
	public abstract int getSubstraction(int a, int b);
	
	public abstract int getMultiplication(int a, int b);
	public abstract int getDivision(int a, int b);
	public abstract int getModulus(int a, int b);
	
	public abstract int getSquare(int a);
	public abstract int getCube(int a);
	public abstract float getAverage(float a, float b, float c, float d, float e);
	public abstract int getFactorOfNumber(int a);
	public abstract int getEvenOrOddNumber(int a);
	
}
