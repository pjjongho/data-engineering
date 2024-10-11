package com.practice.day4_Quiz;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Human grandParent = new GrandParent("GrandFather", 80);
        Human parent = new Parent("Daddy", 45);
        Human child = new Child("Me", 28);


        Human[] humans = {grandParent, parent, child};
        System.out.println("Go walks");
        for(Human human: humans){
            if (human instanceof Walkable){
                ((Walkable) human).walk(1,1);
                System.out.println("============---------============");
            }

            if (human instanceof Runnable){
                ((Runnable) human).run(2,2);
                System.out.println("=============--------============");
            }

            if (human instanceof Swimmable){
                ((Swimmable) human).swim(3,-1);
                System.out.println("=============--------============");
            }
        }
    }
}