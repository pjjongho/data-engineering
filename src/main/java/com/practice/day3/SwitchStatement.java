package com.practice.day3;

public class SwitchStatement {
    enum Score { // enum안에 대문자로 써주는게 규칙임
        A, B, C, D, E;
    }
    public static void main(String[] args) {

        Score input = Score.A;
        switch (input) {
            case A:
                System.out.println("score : 4.0");
                break;
            case B:
                System.out.println("score : 3.0");
                break;
            case C:
                System.out.println("score : 2.0");
                break;
            default:
                System.out.println("out of score");
                break;
        }
        char score = 'F';
        switch (score) {
            case 'A':
                System.out.println("score : 4.0");
                break;
            case 'B':
                System.out.println("score : 3.0");
                break;
            case 'C':
                System.out.println("score: 2.0");
                break;
            default:
                System.out.println("out of score");
                break;
        }
    }
}
