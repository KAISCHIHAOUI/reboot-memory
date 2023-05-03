package org.kclab.switchs;

public class GuardedPattern {
    public static void main(String[] args) {

                  testPattern(null);
                  testPattern(new Animal());
                  testPattern(new Dog());
                  testPattern(new Cat());

    }


    static void testPattern(Animal animal)
    {
        switch (animal)
        {
            case null -> System.out.println("null test");
            case Dog d && d.calculateAge()>0 -> System.out.println("AGE must be in [min:1,max:20]");
            case Cat c -> System.out.println("Cat");
            default -> System.out.println("UNKNOWN !");

        }
    }
}


class Animal{}
class Cat extends Animal{}
class Dog extends Animal{
    int calculateAge()
    {
           return Integer.valueOf(2);
    }
}