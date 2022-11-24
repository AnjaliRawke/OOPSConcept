package com.bridgelabz;

 
 public class ChildClass extends ParentClass{
	 
	
	 
	 
	 @Override
	public void multiply(int num1, int num2) {
		 int result=num1*num2*3;
			System.out.println(result);
	}

	@Override
	void methodToBeInherited() {
		// TODO Auto-generated method stub
		super.methodToBeInherited();
	}

	//instance methods
	 void methodOfChildClass() {
		 System.out.println("This is the method of child class");
		 
	 }
	 
	 public void addition(int num1,int num2) {
		 //we are here doing addition of two numbers
		 int result=num1+num2;
		 System.out.println(result);
		 
	 }
	 //overloading
	 public void addition(int num1,int num2,int num3) {
		 //we are here doing addition of two numbers
		 int result=num1+num2+num3;
		 System.out.println(result);
	 }
 }