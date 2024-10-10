package com.practice.class1_1;

public class CalculationTest {
    static class Calculation {
        static int add(int x, int y){
            int result = x + y;
            return result;
        }

        int subtract(int x, int y) {
            return x - y;
        }
    }


    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.println(calculation.add(100,90));
        System.out.println(Calculation.add(100,80));
        System.out.println(calculation.subtract(100,90));

    }
}
