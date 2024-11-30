package com.upSkill.java_5;

public class AbstractClassImplementation extends Abstraction {

	@Override
	public void iCar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String iName() {
		String name= "upskill";
		return name;
	}
	/* 
	 * Abstraction in Java primarily occurs at compile time, but its effects are utilized at runtime. Here's a breakdown of how this works:

Compile-Time (Definition of Abstraction):

Abstraction is implemented in Java using abstract classes and interfaces.
When you write code that relies on abstract classes or interfaces, the compiler ensures that:
Abstract methods are implemented in concrete subclasses.
Interface contracts are fulfilled by implementing classes.
The compiler checks the structure of your program for adherence to the abstraction.
Runtime (Usage of Abstraction):

At runtime, polymorphism (a key concept enabled by abstraction) comes into play. For example:
java
Copy code
Shape shape = new Circle();
shape.draw();
The draw() method call is resolved at runtime based on the actual object type (Circle in this case).
This dynamic dispatch is a result of runtime behavior, but the abstraction itself was enforced at compile time.
Summary:
Compile-Time: Abstraction is implemented and enforced when defining abstract classes and interfaces.
Runtime: The benefits of abstraction, like polymorphism, are utilized during execution.
	 * */
}
