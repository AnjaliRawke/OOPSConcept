package com.bridgelabz;

import java.util.ArrayList;
import java.util.Objects;

public class Animal {
       String Name;
       String Sound;
       int noOfLegs;
       
       
       
       
       @Override
	public String toString() {
		return "Animal [Name=" + Name + ", Sound=" + Sound + ", noOfLegs=" + noOfLegs + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSound() {
		return Sound;
	}

	public void setSound(String sound) {
		Sound = sound;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		noOfLegs = noOfLegs;
	}

	public Animal() {
    	   
       }
       
       public Animal(String name, String sound, int noOfLegs) {
		this.Name = name;
		this.Sound = sound;
		this.noOfLegs = noOfLegs;
	}

	public void ValuePrinting() {
    	   System.out.println("Animal Name: "+Name+" :::"+" Sound: "+Sound+" :::"+ " No Of Legs: "+noOfLegs);
       }
	
	
	
       
       @Override
	public int hashCode() {
		return Objects.hash(Name, Sound, noOfLegs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(Name, other.Name) && Objects.equals(Sound, other.Sound) && noOfLegs == other.noOfLegs;
	}

	public static void main(String[] args) {
    	   Animal animal1=new Animal("Lion","Roar",4);
    	  //animal1.ValuePrinting();
    	   
    	   Animal animal2=new Animal("Dog","Bark",4);
    	  //animal2.ValuePrinting();
    	   
    	   Animal animal3=new Animal("Cat","Meow",4);
    	   //animal3.ValuePrinting();
    	   
    	   Animal animal4=animal2;
    	   
    	   ArrayList<Animal> Container1=new ArrayList();
    	   Container1.add(animal1);
    	   Container1.add(animal2);
    	   Container1.add(animal3);
    	   System.out.println(Container1);
    	   
    	   System.out.println(animal1.equals(animal2));
    	   System.out.println(animal2.equals(animal4));
    	   
    	   System.out.println(animal3.getClass());
    	   
   	   
       }
   
}
