package com.upSkill.java_6;

public class Multithreading {

	public static void main(String[] args) {
		/* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
		
		Threads can be created by using two mechanisms : 

			1. Extending the Thread class 
			2. Implementing the Runnable Interface */
		int n=5;for(int i=0;i<n;i++){
			MultithreadingThread obj=new MultithreadingThread();
			obj.start();
			Thread obj2=new Thread(new MultithreadingRunable());
			
			/*
			 * Thread Class
The Thread class is responsible for creating and managing a thread.
You can either:

Extend the Thread class directly (and override the run() method), or
Pass a Runnable object to the Thread class's constructor to run the task.

			 * 
			 */
			
			
		}
		
	}

}
