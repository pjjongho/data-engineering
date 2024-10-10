package com.practice.day3;

public class WhileQuiz2 {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 30; ++i){
            if (i%2 == 0){
                sumEven += i;
            }
            else {
                sumOdd += i;
            }
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
