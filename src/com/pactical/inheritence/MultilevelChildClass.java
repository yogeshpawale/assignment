package com.pactical.inheritence;

public class MultilevelChildClass extends MultilevelParentClass {

	public void laptop() {
		System.out.println("childs laptop");
	}
	
	public static void main(String[] args) {
		
		MultilevelChildClass child = new MultilevelChildClass();
		child.laptop();
		child.bunglow();
		child.land();
		child.volkswogon();
	
		// dynamic dispatch concept -- to assign the value of child class refernce to parent class
		
		System.out.println();
		MultilevelParentClass parent = new MultilevelChildClass();
		parent.bunglow();
		parent.volkswogon();
		parent.land();
//		parent.laptop();
	}
}
