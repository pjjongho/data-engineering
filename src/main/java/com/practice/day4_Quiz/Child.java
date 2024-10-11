package com.practice.day4_Quiz;

public class Child extends Human implements Walkable, Runnable, Swimmable{


    public Child(String name, int age) {
        super(name, age, 5);
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
    public void swim(int x, int y) {
        printWhoAmI();
        System.out.println("Swim speed: "+ (speed+1));
        this.x =x;
        this.y = y;
        System.out.println("Swum to " + getLoacation());

    }

    @Override
    public void walk(int x, int y) {
        printWhoAmI();
        System.out.println("Walk speed: "+ speed);
        this.x =x;
        this.y = y;
        System.out.println("Wakled to " + getLoacation());

    }
}
