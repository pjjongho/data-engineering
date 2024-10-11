package com.practice.day4;

public class Pigeon extends Bird{
    @Override
    boolean flyable(int z) {
        return z < 10000;
    }
}
