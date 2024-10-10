package com.practice.day3;

public class WhileStatement {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        while (i < 10) {
            sum += 1;
            if (sum > 50){
                if (sum < 60){
                    continue;
                }
                break;
            }
            System.out.println(sum);
        }

        System.out.println("final sum: " + sum);
    }
}
