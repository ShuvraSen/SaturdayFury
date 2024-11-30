package com.upSkill.java_2;

public class IfElseStatemeny {

	public static void main(String[] args) {
		int age = 62;
		if (age <= 13) {
			System.out.println("u r children");
		} else if (age <= 18)
//		(age>13 && age<18)
			{
			System.out.println("you are teenage");
		} else if (age <= 55) {
			if(age>100)
			{System.out.println("champion");}
			else{System.out.println("not");
		} }else {
			System.out.println("senior");
		}
	}

	}
