package com.practice.day3;

public class DoWhileStatement {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        do{
            sum += i+1;
            i ++;

        } while (i < 100);

        System.out.println(sum);

    }
}

