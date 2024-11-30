package com.upSkill.java_5;

public  abstract class Abstraction {
//there are 3 type of class
	//1. regular class
	//2. abstract class
	//3. interface class
	public abstract void iCar();
//	interface or abstract method need to start 
	//with i. It is a convention
	//abstract class may have abstract method or regular method.
//need to put abstract keyword before class and method
	
	public void carTesla(){
		System.out.println("every student of Upskill will be able to buy Tesla car");
	}
	public abstract String iName();
}


