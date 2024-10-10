package com.practice.day3;

public class IfStatement {
    public static void main(String[] args) {
        int check = 100;
        int num1 = 150;
        if (num1 > check){
            System.out.println("Bigger than 100");
        } else if (num1 == check){
            System.out.println("100");
        } else {
            System.out.println("Smaller than 100");
        }
    }
}
