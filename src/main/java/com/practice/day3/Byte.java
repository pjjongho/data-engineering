package com.practice.day3;

public class Byte {
    public static void main(String[] args) {
        byte data = 'd';
        System.out.println(data);
        Defaults defaults = new Defaults();
        System.out.println(defaults.defaultByte);
    }

    static class Defaults {
        byte defaultByte;
    }
}
