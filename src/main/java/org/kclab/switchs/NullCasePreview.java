package org.kclab.switchs;

import static java.lang.System.*;

public class NullCasePreview {
	
    public static void main(String[] args) {
    	matchingRedifine(String.valueOf("SEQUENCE"));
    	matchingRedifine(null);     
    }
   //Empty statement [preview]!!
    static void matchingRedifine(Object obj) {
        switch (obj) {
            case null           -> out.println("oops!");
            case String s       -> out.println("String: " + s);
            default             -> new IllegalArgumentException();
        }
    }
         
}
