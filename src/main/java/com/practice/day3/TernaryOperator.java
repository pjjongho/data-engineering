package com.practice.day3;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score <= 100 && score> 90){
            System.out.println("A");
        }

        else if (score <= 90 && score > 80){
            System.out.println("B");
        }

        else if (score <= 80 && score >70){
            System.out.println("C");
        }

        else {
            System.out.println("F");
        }
    }
}
