package com.practice.day4_1;

public interface Bird {

    String STATIC_VARIABLE = "STATIC";

    void fly(int x, int y, int z);

    default void printBread() {
        System.out.println(getBreed());
    }

    String getBreed();

    static void staticMethod() {
        System.out.println("This is static method");
    }

    abstract void abstractMethod();

}
