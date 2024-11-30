package com.upSkill.java_3;

import java.nio.file.WatchService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class ArrayHashMap_HashTable {

	public static void main(String[] args) {
//		// Array store multiple data using index
//		int age=25;//variable
//		int[] ageFyry=new int[]{25,30,55,75};//Array declair
//		String[] nameFyry=new String[]{"asma","bilash","umme","kulsum","momo"};//Array declair
//		System.out.println(ageFyry[2]);
//		System.out.println(nameFyry[3]);
//		System.out.println(ageFyry.length);
//		System.out.println(nameFyry.length);
//		//it is a built-in method of array how many elements it has
//		int[][] agrFury2D={{25,12,58,44,20},{24,55,47}};  
//		
//		String[][] nameFury2D={{"asma","bilash","umme","kulsum","momo"},{"bilash","momo","umme","kulsum","momo"}};  
//		System.out.println(nameFury2D.length);
//		System.out.println(nameFury2D[1][2]);
//		
////		hashmap:store multiple data using key value pair
//		
//	HashMap<String,String> Student=new HashMap<String,String>();
//	Student.put("Dhaka","Bangladesh");
//	Student.put("Washington DC", "USA");
//	Student.put("Kathmundu", "NepAl");
//	Student.put("Berlin", "Germany");
//	System.out.println(Student.get("Washington DC"));
	
//	HashTable:store multiple data using key value pair.no duplicate value 
	Hashtable<String,String> Region=new Hashtable<String,String>();
	Region.put("Texas","Austin");
	Region.put("Missouri", "Jefferson City");
//	Region.put("Missouri", "NepAl");
	System.out.println(Region.get("Missouri"));
	 for (String key : Region.keySet()) {
         System.out.println("Key: " + key + ", Value: " + Region.get(key));
     };
	/*
	The main differences between Java's HashMap and Hashtable are related to synchronization, null keys/values, and performance. Here’s a detailed look at each:

1. *Synchronization*:
   - *Hashtable* is synchronized, meaning it’s thread-safe and suitable for multi-threaded environments where multiple threads might be accessing and modifying it simultaneously.
   - *HashMap* is not synchronized by default, making it faster in single-threaded environments but potentially unsafe in multi-threaded situations. For thread-safe operations, you would need to use Collections.synchronizedMap(new HashMap<>()) or consider using ConcurrentHashMap.

2. *Null Keys and Values*:
   - *Hashtable* does not allow any null keys or values. Attempting to insert a null key or value will throw a NullPointerException.
   - *HashMap* allows one null key and multiple null values, which can be helpful in scenarios where null represents a legitimate value or key.

3. *Performance*:
   - *HashMap* is generally faster than *Hashtable* because it isn’t synchronized by default. The absence of synchronization reduces overhead, making HashMap more efficient in single-threaded contexts.
   - *Hashtable* has higher overhead due to its synchronization, so it may be slower, especially in high-performance applications.

4. *Legacy vs. Modern Class*:
   - *Hashtable* is a legacy class, part of the original Java 1.0. While it’s still used, Java’s Collections Framework introduced HashMap as the preferred option for modern applications in Java 1.2.
   - *HashMap* is part of the Java Collections Framework, meaning it has more flexible design and compatibility with other collection classes.

5. *Iterator vs Enumerator*:
   - *HashMap* uses an Iterator for traversing elements, which is fail-fast (it will throw a ConcurrentModificationException if the map is modified during iteration).
   - *Hashtable* uses an Enumerator, which is not fail-fast.

*Summary*:
- Use *HashMap* if you don’t need thread safety, want to allow null keys/values, and prioritize performance.
- Use *Hashtable* if you need a thread-safe implementation without manually synchronizing a HashMap, though ConcurrentHashMap is generally preferred in multi-threaded applications.
	
	*/
	
	//Hashset store unordered collection containing unique value, Implementation of Set interface
	
			HashSet<String> Car = new HashSet<String>();
			
			Car.add("BMW");
			Car.add("Toyota");
			Car.add("Audi");
			Car.add("Ford");
			
			System.out.println("Car : " + Car);


		
	}

}
