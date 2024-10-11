package com.practice.day4;

public class Calculator {

//// Overloading

    int add(int x, int y, int z){
        return x + y + z;
    }

    long add(int a, int b, long c){ // Overloading의 조건으로 이름과 파라미터의 타입과 갯수가 같아야함.
        return a + b + c;
    }

    int add(int x, int y){
        return x + y;
    }
}
