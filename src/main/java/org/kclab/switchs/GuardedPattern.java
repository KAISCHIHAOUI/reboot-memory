package org.kclab.switchs;

import static java.lang.System.*;

public class GuardedPattern {

	public static void main(String[] args) {

		
		testGuardRedif(new Animal());
		testGuardRedif(new Dog());
		testGuardRedif(new Cat());
	}

	static void testGuardRedif(Animal animal) {
      
		switch (animal) {
		case Dog d when (d.calculateAge() > 0) -> out.println("AGE must be in [min:1,max:20]"+d.calculateAge());
		case Cat c -> out.println("This is a Cat "+c);
		default -> animal.toString();

		}
	}
}

class Animal {
	public Animal() {
		super();
	}
	
	int calculateAge() {
	   return Integer.valueOf(0);	
	}
}

class Cat extends Animal {
	
}

class Dog extends Animal {
     @Override
	int calculateAge() {
		return Integer.valueOf(5);
	}
}