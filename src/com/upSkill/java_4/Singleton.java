package com.upSkill.java_4;

public class Singleton {
	
	private static Singleton objSingleton;
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if (objSingleton==null){
			objSingleton=new Singleton();
		}
		
			return objSingleton;
//			this change in singleton in comment
			
			/*
			 *if i put else {	return objSingleton;} it shows error
ChatGPT said:
ChatGPT
The reason you are getting an error if you add else 
{ return objSingleton; } in the getInstance() 
method is because return is already being used 
in the if block, and Java is expecting control 
to flow to a single exit point from the method 
after any condition is evaluated.

In other words, once you use return objSingleton;
 inside the if block, Java doesn't know what to do with
  the else block if return is called. It’s a control flow issue because
   return causes the method to exit, and any code after return will not be
    executed, including the else part.
			 */
		
	}
	

//	public static void main(String[] args) {
////		Constructor obj=new Constructor();
//
//	}

}
