package org.example;

import static java.lang.System.*;

public class SwitchEnumerate {
    private enum DaysOfTheWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        testDayOfTheWeek(DaysOfTheWeek.MONDAY);
        testDayOfTheWeek(DaysOfTheWeek.THURSDAY);
        testDayOfTheWeek(DaysOfTheWeek.TUESDAY);
        testDayOfTheWeek(DaysOfTheWeek.WEDNESDAY);
        testDayOfTheWeek(DaysOfTheWeek.FRIDAY);
        testDayOfTheWeek(DaysOfTheWeek.SATURDAY);
        testDayOfTheWeek(DaysOfTheWeek.SUNDAY);
        testDayOfTheWeek(null);
    }
     static void testDayOfTheWeek(DaysOfTheWeek days) {
        if(days!=null) {
            switch (days) {
                case MONDAY -> out.println(days + " is first day of the week");
                case TUESDAY -> out.println(days + " is second day of the week");
                case WEDNESDAY -> out.println(days + " is third day of the week ");
                case THURSDAY -> out.println(days + " is fourth day of the week ");
                case FRIDAY -> out.println(days + " is fifth day of the week ");
                case SATURDAY -> out.println(days + " is sixth day of the week ");
                case SUNDAY -> out.println(days + " is seventh and the last day of the week ");
                default -> out.println("OUT OF THE BOX !");
            }
        }
        else
            out.print("NULL");
    }
}
