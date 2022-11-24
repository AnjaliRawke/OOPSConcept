package com.bridgelabz;

public class ParentClass extends Object{
	

		//final keyword will make your variable constant /method constant
		final static double piValue=3.14;
		
		
		public void multiply(int num1,int num2) {
			
		}
		//instance method
		final double perimeter(int length,int breadth) {
			double result= length*breadth*piValue;
		    result++;
		    return result;
		}
		
		//inheritance
		void methodToBeInherited() {
			System.out.println("This is Parent Method");
		}
		
		public static void main(String[] args) {
			ChildClass shape=new ChildClass();
			double resultValue =shape.perimeter(24,65);
		    System.out.println(resultValue);
		}
		
	}

