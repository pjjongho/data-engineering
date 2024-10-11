package com.practice.day4;

public abstract class Bird {
    private int x,y,z;

    void fly(int x, int y, int z){
        System.out.println("Move on. ");
        this.x=x;
        this.y=y;
        if (flyable(z)) {
            this.z = z;
        } else {
            System.out.println(z + " 높이로는 날 수 없음.");
        }
        this.z=z;
        printLocation();
    }

    public void printLocation() {
        System.out.println("현재 위치 (" + x + "," + y + "," + z + ")");
    }

    abstract boolean flyable (int z);
}
