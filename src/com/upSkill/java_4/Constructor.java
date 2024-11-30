package com.upSkill.java_4;

public class Constructor {
	int myName;
	
	public Constructor(int age){
		myName=age;
		
		
	}
	public Constructor(){
		
		
		
	}
	public Constructor(int age,String name){
		myName=age;
		
		
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor(23);
		
		System.out.println("main");
		
	}

}
