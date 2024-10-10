package com.practice.day2;

public class OtherClass {

    public static void main(String[] args){
        System.out.println("outer class");
        InnerClass innerClass = new InnerClass();
        innerClass.printName();
    }
    public static class InnerClass{

        public void printName() {
            System.out.println(this.getClass().getName());
            System.out.println(this.getClass().getName());
        }
    }
}