package org.kclab.switchs;

public class Main {
    public static void main(String[] args)
    {
        String day = "Saturday";
        switch (day) {
            case "Monday" -> System.out.println("Week day");
            case "Tuesday" -> System.out.println("Week day");
            case "Wednesday" -> System.out.println("Week day");
            case "Thursday" -> System.out.println("Week day");
            case "Friday" -> System.out.println("Week day");
            case "Saturday" -> System.out.println("Weekend");
            case "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Unknown");
        }
    }
}