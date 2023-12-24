package org.kclab.records;

import static java.lang.System.*;

public class Motivation {
	
	static Person person = new Person("Anonymous",30);

    public static void main(String[] args) {
		/*
		 * Here, the instance of operator alongside the Record Pattern Person
		 * de-constructs the person object, providing direct access to its fields.
		 */
    	if(person instanceof Person(var name ,var age))
    	{
    		out.println(person.toString());
    	}

	}

}
record Person(String name,int age) {}
