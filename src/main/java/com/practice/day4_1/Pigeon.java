package com.practice.day4_1;

public class Pigeon implements Bird, Pet{
    private int x,y,z;

    @Override
    public void fly(int x, int y, int z) {
        System.out.println("Flying");
        this.x=x;
        this.y=y;
        this.z=z;
    }

    @Override
    public String getBreed() {
        return "Pigeon";
    }

    @Override
    public void abstractMethod() {
        System.out.println(" This sis abtract method implement pigeon");
    }

    public void printLoacation() {
        System.out.println("현재 위치 (" + x + "," + y + "," + z + ")");

    }

    @Override
    public String getHome() {
        return "Korea";
    }
}
