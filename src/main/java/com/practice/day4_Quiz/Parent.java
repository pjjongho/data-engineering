package com.practice.day4_Quiz;

public class Parent extends Human implements Walkable, Runnable{
    public Parent(String name, int age) {
        super(name, age, 3);
    }

    @Override
    public void run(int x, int y) {
        printWhoAmI();
        System.out.println("run speed: "+ (speed+2));
        this.x =x;
        this.y = y;
        System.out.println("run to " + getLoacation());
    }

    @Override
    public void walk(int x, int y) {
        printWhoAmI();
        System.out.println("Walk speed: "+ speed);
        this.x =x;
        this.y = y;
        System.out.println("wakled to " + getLoacation());
    }
}
