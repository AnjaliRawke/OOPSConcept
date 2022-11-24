package com.bridgelabz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Train {
    private String Name;
      int number=1232;
     
      public String getName() {
  		return Name;
  	}

  	public void setName(String name) {
  		this.Name = name;
  	}

  	public int getNumber() {
  		return number;
  	}

  	public void setNumber(int number) {
  		this.number = number;
  	}
  	
      
	public Train() {
    	  
      }
    
	public Train(String name, int number) {
		
		this.Name = name;
		this.number = number;
	}

	public void InstMethod()
     {
    	 System.out.println(Name+" "+number);
    	 
     }
     public static void StaticMethod() {
    	 //System.out.println("My train");
    	
     }
     
     public static void main(String[] args) {
    	 Train obj=new Train("Train Name: Sachkhand Express",4321);
    	 obj.InstMethod();
    	 //System.out.println();
    	 //System.out.println(obj);
    	 
    	 Train obj2=new Train("Train Name: Allahabad Express",56473);
    	 obj2.InstMethod();
    	 //System.out.println();
    	 //System.out.println(obj2);
    	 
    	 Train obj3=new Train("Train Name: Pune Express",57684);
    	 obj3.InstMethod();
    	 //System.out.println();
    	 //System.out.println(obj3);
    	 
    	 Train obj4=new Train("Train Name: Ned-Panvel",567483);
    	 obj4.InstMethod();
    	 //System.out.println();
    	 //System.out.println(obj4);
    	 
    	 //StaticMethod();
    	 System.out.println(obj);
    	 
    	 ArrayList<Train> Container1=new ArrayList();
    	 Container1.add(obj);
    	 Container1.add(obj2);
    	 Container1.add(obj3);
    	 Container1.add(obj4);
    	 System.out.println(Container1);
    	 
    	 Stack Container2=new Stack();
    	 
    	 Queue Container3=new PriorityQueue();
    	 
    	 LinkedList Container4=new LinkedList();
   	 
     }
     }

	

