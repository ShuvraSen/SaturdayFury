package com.upSkill.assignment_1;

public class FinalizeConcept {
	public void finalize(){
		System.out.println("it will execute automatically");
		
		
	};

	public static void main(String[] args) {
		FinalizeConcept f1=new FinalizeConcept();
		FinalizeConcept f2=new FinalizeConcept();
		f1=null;
		f2=null;
		System.gc();
		System.out.println(f1);
		/*
		 * 
		 * The finalize() method is not intended to modify or restore references.
Once f1 is set to null, it remains null, regardless of whether the object is finalized or not.
		 */
	}

}
