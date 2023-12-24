package org.kclab.records;

import static java.lang.System.*;

/*
 * Generic record
 * Parameterized vs Raw Types:
 */

public class InferenceApplication {

	static Box<String> bx = new Box<>("BlackBox"); 
	
	public static void main(String[] args) {
		 testPattern(bx);
	}

	
	static void testPattern(Box<String> t)
	{
		//Parameter
		if(t instanceof Box<String>(var seqStr))
		{
		    out.println("Box<String> : "+t.toString());
		}
		
		//Raw Type
		if(t instanceof Box(var seqStr))
		{
			out.println("Box : "+t.toString());
		}
	}
	

}

record Box<T> (T t){}