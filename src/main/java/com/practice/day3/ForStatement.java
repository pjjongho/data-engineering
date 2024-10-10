package com.practice.day3;

public class ForStatement {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i ++){
            sum += i + 1;
        }
        System.out.println(sum);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for(int i = 0; i < days.length; i++){
            System.out.println(days[i]);
        }
    }
}
