package com.practice.day3;

public class Bool {
    public static void main(String[] args) {
        boolean fact = true;
        System.out.println(fact);

        Defaults defaults = new Defaults();
        System.out.println(defaults.booleanDefault);
    }

    static class Defaults {
        boolean booleanDefault;
    }
}
