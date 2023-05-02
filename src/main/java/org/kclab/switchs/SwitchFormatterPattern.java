package org.kclab.switchs;

public class SwitchFormatterPattern {
    //JEP 406
    public static void main(String[] args) {
        System.out.println(testFormatterPattern("TEST FORMAT PATTERN JAVA 17 - JEP 406"));
        System.out.println(testFormatterPattern(30.00));
        System.out.println(testFormatterPattern(true));
        System.out.println(testFormatterPattern(3.1414f));
        System.out.println(testFormatterPattern(Math.cos(0)));


    }

    static String testFormatterPattern(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("string %s", s);
            case Float f -> String.format("float %f", f);
            case Boolean b -> String.format("boolean %b", b);
            default -> o.toString();
        };
    }
}
