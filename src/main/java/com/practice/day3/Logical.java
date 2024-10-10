package com.practice.day3;

public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // 둘다 true면 true, 하나라도 false면 false
        System.out.println(a || b); // 둘중 하나라도 true면 true

        System.out.println((1 > 2) || (3 > 2));
    }
}
