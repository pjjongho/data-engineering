package com.practice.day4;

public class Pigeon_extends {
    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        Bird peakcock = new Peacock();


        System.out.println("---------- Pigeon ----------");
        pigeon.fly(1,1,3);

        System.out.println("----------- Peakcock -----------");
        peakcock.fly(1,1,3);

        System.out.println("--------Higher Pigeon ---------");
        pigeon.fly(1,3,3000000);

        System.out.println("----------Higher Peakcock------------");
        peakcock.fly(3,3,500000);
    }
}
