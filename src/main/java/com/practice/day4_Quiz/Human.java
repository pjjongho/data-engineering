package com.practice.day4_Quiz;

public class Human {
    String name;
    int age;
    int x,y;
    int speed;

    public Human(String name, int age, int x, int y, int speed){
        this.name = name;
        this.age = age;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }


    public Human(String name, int age, int speed) {
        this(name, age, 0, 0, speed);
    }

    public String getLoacation() {
        return "(" + x + "," + y + ")";
    }

    public void printWhoAmI() {
        System.out.println("My name is "+ name + ". " + age + " years old.");
    }
}
