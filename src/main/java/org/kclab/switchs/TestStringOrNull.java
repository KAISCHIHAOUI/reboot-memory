package org.kclab.switchs;

public class TestStringOrNull {
    public static void main(String[] args) {
        combineStringAndNull("JAVA 17");
        combineStringAndNull(null);
    }
    static void combineStringAndNull(Object o)
    {
         switch (o)
                {
                    case null,String s -> System.out.println(" "+s);
                    default -> System.out.println("Default expression !");
                };
    }
}
