package com.upSkill.java_1;

import java.lang.reflect.Method;

public class Variables {
	public String country="USA";
	
	public void my(){
		String city="Nevada";
		String state="missouri";
		System.out.println("country");
		System.out.println("country- "+country+"," +"city- "+ city + ","+"state- "+ state);
	}

	public static void main(String[] args) {
		Variables myObj=new Variables();
		myObj.my();
//	4 types of variables in java
/*	Instance or Global variable:variables declared in the class level and outside the method
//	When we say a variable is declared "outside the method", it means the variable is 
//		declared outside any specific method, including the main method. It is placed at 
//		the class level but inside the class. */
		
		
		
		

//	Static variables:variable belongs to class and do not need to create object
//		Local variable:variables declared in the methods
//		method parameter:variables used in a method parameter
//		method:method is a group of some code that allows us to do some action.
		
	

	}

}
