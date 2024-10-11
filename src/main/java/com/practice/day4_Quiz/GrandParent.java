package com.practice.day4_Quiz;

public class GrandParent extends Human implements Walkable{

    public GrandParent(String name, int age) {
        super(name, age, 1);
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
